package com.adam.app.threadpool;

import java.util.ArrayList;
import java.util.List;

interface Request {
    void execute();
}

class WorkThread extends Thread {

    private Request request;
    private boolean isContinue = true;
    
    boolean isIdle() {
        boolean isIdle = false;
        
        if(request == null) isIdle = true;
        
        return isIdle;
    }
    
    void setRequest(Request request) {
        Utils.info("+++ setRequest +++");
        synchronized(this) {
            Utils.info("====> setRequest: Lock <===");
            if(isIdle()) {
                this.request = request;
                notify();
            }
        }
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        long tid = Thread.currentThread().getId();
        while(isContinue) {
            synchronized(this) {
                Utils.info("====> run: Lock <===");
                Utils.info("Thread id: " + String.valueOf(tid) + " WorkThread run...");
                try {
                    wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                request.execute();
                request = null;
            }
        }
    }
    
    void terminate() {
        isContinue = false;
        setRequest(new Request(){

            @Override
            public void execute() {
                // TODO Auto-generated method stub
                Utils.info("do nothing...");
            }
            
        });
    }
}

class WorkThreadPool {
    private List<WorkThread> workerThreads;
    WorkThreadPool() {
        workerThreads = new ArrayList<WorkThread>();
    }
    
    synchronized void service(Request request) {
        boolean idleNotFound = true;
        for(WorkThread workthread : workerThreads) {
            if(workthread.isIdle()) {
                workthread.setRequest(request);
                idleNotFound = false;
                break;
            }
        }
        
        if(idleNotFound) {
            WorkThread workthread = createThread();
            workthread.setRequest(request);
        }
    }
    
    synchronized void cleanIdle() {
        for(WorkThread workthread : workerThreads) {
            if(workthread.isAlive()) {
                workerThreads.remove(workthread);
                workthread.terminate();
            }
        }
    }
    
    private WorkThread createThread() {
        Utils.info("+++ createThread +++");
        WorkThread workthread = new WorkThread();
        workthread.start();
        workerThreads.add(workthread);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
                        
        return workthread;
    }
    
}

class Service {
    private WorkThreadPool pool = new WorkThreadPool();
    
    void accept(Request request) {
        pool.service(request);
    }
    
}

class Client implements Runnable {

    private Service service;
    private int mId;
    Client(Service service, int id) {
        this.service = service;
        this.mId = id;
    }
    
    @Override
    public void run() {
        
        Request request = new Request(){

            @Override
            public void execute() {
                // TODO Auto-generated method stub
                Utils.info("#" + String.valueOf(mId) +" Client request...");
                try {
                    Thread.sleep((int)Math.random()*3000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
            
        };
        
        service.accept(request);
        try {
            Thread.sleep((int)Math.random()*3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        
        // Five client use this thread pool at the same time
        Utils.info("Five client use this thread pool at the same time");
        for(int i = 0; i < 5; i++) {
            (new Thread(new Client(service, i))).start();
        }
        Utils.info("Done!!!");
    }
}



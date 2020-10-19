/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: SharedData.java
 * Brief: Handle message
 * 
 * Author: AdamChen
 * Create Date: 2020/10/19
 */


package com.adam.app.producerconsumer.pattern;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * <h1>SharedData</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2020/10/19
 */
public class SharedData {
    
    /**
     * Thread safety singleton design
     */
    private static class Helper {
        private static SharedData sINSTANCE = new SharedData();
    }
    private SharedData() {}
    
    public static SharedData newInstance() {
        return Helper.sINSTANCE;
    }
    
    // lined blocking queue
    private LinkedBlockingQueue<Integer> mQueue = new LinkedBlockingQueue<Integer>(2);
    
    /**
     * Write message to queue
     *
     * @param
     * @return
     */
    public void writeMessage(int msg) {
        try {
            this.mQueue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
            // Re throw interruption
            Thread.currentThread().interrupt();
        } finally {
           
        }
    }
    
    /**
     * Read message from queue
     *
     * @param
     * @return
     */
    public int readMessage() {
        try {
            int msg = this.mQueue.take();
            return msg;
        } catch (InterruptedException e) {
            e.printStackTrace();
            // Re throw interruption
            Thread.currentThread().interrupt();
        } finally {
            
        }
        
        return -1;
    }
    
    
}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

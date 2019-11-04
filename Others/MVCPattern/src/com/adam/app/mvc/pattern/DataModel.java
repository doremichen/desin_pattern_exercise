/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: DataModel.java
 * Brief: Model
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */

package com.adam.app.mvc.pattern;

/**
 * @author AdamChen
 * 
 */
public class DataModel {

    private String mInfo;
    private OnDataDoneListener mListener;

    public interface OnDataDoneListener {
        void done(String result);
    }
    
    public DataModel(String defaultStr) {
        this.mInfo = defaultStr;
    }

    public void updateData(String info, OnDataDoneListener listener) {
        this.mInfo = info;
        this.mListener = listener;

        // start thread to update model
        new Thread(new UpdateTask()).start();
    }

    /**
     * Update model task
     */
    private class UpdateTask implements Runnable {

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Runnable#run()
         */
        @Override
        public void run() {
            Utils.info(this, "run");
            // delay 1 sec
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            String result = mInfo + " is complete!!!";
            // notify controller
            mListener.done(result);

        }

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":" + "Info = " + this.mInfo;
    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

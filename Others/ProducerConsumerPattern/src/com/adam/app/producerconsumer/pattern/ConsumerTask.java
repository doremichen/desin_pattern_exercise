/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: ConsumerTask.java
 * Brief: Handle to get message from queue
 * 
 * Author: AdamChen
 * Create Date: 2020/10/19
 */


package com.adam.app.producerconsumer.pattern;

/**
 *
 * <h1>ConsumerTask</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2020/10/19
 */
public class ConsumerTask implements Runnable {

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        Utils.info(this, "[run]~~~");
        while (true) {
            // Put message in queue
            int msg = SharedData.newInstance().readMessage();
            if (msg == -1) break; // terminate
            Utils.info(this, "read msg from queue: " + String.valueOf(msg));

        }

    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

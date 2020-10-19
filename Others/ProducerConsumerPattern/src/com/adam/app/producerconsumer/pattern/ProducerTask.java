/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: ProducerTask.java
 * Brief: Handle to put message in queue
 * 
 * Author: AdamChen
 * Create Date: 2020/10/19
 */


package com.adam.app.producerconsumer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * <h1>ProducerTask</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2020/10/19
 */
public class ProducerTask implements Runnable {
    
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        Utils.info(this, "[run]~~~");
        for (int i = 0; i < 10; i++) {
            Utils.info(this, "Put message: " + String.valueOf(i));
            SharedData.newInstance().writeMessage(i);
            Utils.delay(10L);
        }
        // terminate
        SharedData.newInstance().writeMessage(-1);
    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

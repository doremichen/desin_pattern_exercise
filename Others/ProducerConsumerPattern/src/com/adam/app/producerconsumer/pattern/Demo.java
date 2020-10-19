/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Demo.java
 * Brief: Process producer consumer pattern
 * 
 * Author: AdamChen
 * Create Date: 2020/10/19
 */

package com.adam.app.producerconsumer.pattern;

public class Demo {

    public static void main(String[] args) {
        
        // Build producer task and consumer task
        ProducerTask pTask = new ProducerTask();
        ConsumerTask cTask = new ConsumerTask();
        
        // Run
        new Thread(pTask).start();
        new Thread(cTask).start();
        
    }

}

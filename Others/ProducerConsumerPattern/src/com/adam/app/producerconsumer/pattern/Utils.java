/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Utils.java
 * Brief: Provide log info method
 * 
 * Author: AdamChen
 * Create Date: 2020/10/19
 */


package com.adam.app.producerconsumer.pattern;

/**
 * @author AdamChen
 *
 */
public final class Utils {
    
    public static void info(Object obj, String str) {
        System.out.println(obj.getClass().getSimpleName() + ": " + str);
    }
    
    public static void info(Class<?> clazz, String str) {
        System.out.println(clazz.getSimpleName() + ": " + str);
    }
    
    public static void delay(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            // Re throw interrupt
            Thread.currentThread().interrupt();
            e.printStackTrace();
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

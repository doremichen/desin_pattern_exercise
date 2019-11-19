/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Utils.java
 * Brief: Tool set
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */


package com.adam.app.null_object.pattern;

/**
 *
 * <h1>Utils</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public final class Utils {

    /**
     * Log mesage
     *
     * @param obj instance object
     * @param msg log information
     * @return
     */
    public static void info(Object obj, String msg) {
        System.out.println(obj.getClass().getSimpleName() + ": " + msg);
    }
    
    /**
     * Log message
     *
     * @param clazz instance object
     * @param msg log information
     * @return
     */
    public static void info(Class<?> clazz, String msg) {
        System.out.println(clazz.getSimpleName() + ": " + msg);
    }
    
}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

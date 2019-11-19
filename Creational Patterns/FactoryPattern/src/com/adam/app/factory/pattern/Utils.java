/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Utils.java
 * Brief: Provide log information operator
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */

package com.adam.app.factory.pattern;

/**
 * @author AdamChen
 */
public final class Utils {

    /**
     * Log mesage
     * 
     * @param obj instance object
     * @param str log information
     * @return
     */
    public static void info(Object obj, String str) {
        System.out.println(obj.getClass().getSimpleName() + ": " + str);
    }

    /**
     * Log message
     * 
     * @param clazz class object
     * @param str log information
     * @return
     */
    public static void info(Class<?> clazz, String str) {
        System.out.println(clazz.getSimpleName() + ": " + str);
    }
}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

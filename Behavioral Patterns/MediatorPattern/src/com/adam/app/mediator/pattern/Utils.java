/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Utils.java
 * Brief: Provide tool set
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */

package com.adam.app.mediator.pattern;

/**
 * <h1>Utils</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public final class Utils {
    /**
     * Log info
     * 
     * @param obj instance object
     * @param str log msg
     * @return
     */
    public static void info(Object obj, String str) {
        System.out.println(obj.getClass().getSimpleName() + ": " + str);
    }

    /**
     * Log info
     * 
     * @param clazz Class object
     * @param str log msg
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

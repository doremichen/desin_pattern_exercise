/**
 * ===========================================================================
 * Copyright Adam Sample code All Rights Reserved
 * ===========================================================================
 * File Name: Utils.java 
 * Brief: Provide tool set 
 * 
 * Author: AdamChen Create 
 * Date:
 * 2019/11/5
 */

package com.adam.app.template.pattern;

/**
 * <h1>Utils</h1> Provide log info method
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public final class Utils {

    /**
     * Used to instance object
     * 
     * @param obj instance object
     * @param str log string
     * @return void
     */
    public static void info(Object obj, String str) {
        System.out.println(obj.getClass().getSimpleName() + ": " + str);
    }

    /**
     * Used to class object
     * 
     * @param clazz class object
     * @param str log string
     * @return void
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

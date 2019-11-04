/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Utils.java
 * Brief: Provide log info operator
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */


package com.adam.app.pattern.bridge;

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

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

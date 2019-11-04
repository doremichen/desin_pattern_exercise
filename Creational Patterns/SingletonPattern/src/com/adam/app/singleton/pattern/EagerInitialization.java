/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: EagerInitialization.java
 * Brief: Eager initialization
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */

package com.adam.app.singleton.pattern;

/**
 * @author AdamChen
 * 
 */
public class EagerInitialization {

    private static EagerInitialization sINSTANCE = new EagerInitialization();

    public static EagerInitialization getInstance() {
        return sINSTANCE;
    }

    private EagerInitialization() {
        // singleton
    }

    public void foo() {
        Utils.info(this, "foo");
    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

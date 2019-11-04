/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: StaticBlockInitialization.java
 * Brief: Static block initialization
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */

package com.adam.app.singleton.pattern;

/**
 * @author AdamChen
 * 
 */
public class StaticBlockInitialization {

    private static StaticBlockInitialization sINSTANCE;

    static {
        sINSTANCE = new StaticBlockInitialization();
    }

    public static StaticBlockInitialization getInatnce() {
        return sINSTANCE;
    }

    private StaticBlockInitialization() {
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

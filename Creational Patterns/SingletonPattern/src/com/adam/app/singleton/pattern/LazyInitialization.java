/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: LazyInitialization.java
 * Brief: Lazy initialization
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */

package com.adam.app.singleton.pattern;

/**
 * @author AdamChen
 * 
 */
public class LazyInitialization {

    private static LazyInitialization sINSTANCE;

    public static LazyInitialization getInstance() {

        if (sINSTANCE == null) {
            sINSTANCE = new LazyInitialization();
        }

        return sINSTANCE;
    }

    private LazyInitialization() {
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

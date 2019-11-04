/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: DCLP.java
 * Brief: Thread safe singleton
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */

package com.adam.app.singleton.pattern;

/**
 * @author AdamChen
 * 
 */
public class DCLP {

    private static DCLP sINSTANCE;

    public static DCLP getInstance() {

        if (sINSTANCE == null) {
            synchronized (DCLP.class) {
                if (sINSTANCE == null) {
                    sINSTANCE = new DCLP();
                }
            }
        }

        return sINSTANCE;
    }

    private DCLP() {
        // Singleton
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

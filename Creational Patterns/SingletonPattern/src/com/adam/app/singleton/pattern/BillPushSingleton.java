/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: BillPushSingleton.java
 * Brief: Bill push singleton
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */

package com.adam.app.singleton.pattern;

/**
 * @author AdamChen
 * 
 */
public class BillPushSingleton {

    private static class Helper {
        private static final BillPushSingleton sINSTANCE = new BillPushSingleton();
    }

    public static BillPushSingleton getInstance() {
        return Helper.sINSTANCE;
    }

    private BillPushSingleton() {
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

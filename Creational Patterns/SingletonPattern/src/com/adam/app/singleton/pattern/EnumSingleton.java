/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: EnumSingleton.java
 * Brief: enum signleton
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */

package com.adam.app.singleton.pattern;

/**
 * @author AdamChen
 * 
 */
public enum EnumSingleton {
    sINSTANCE;

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

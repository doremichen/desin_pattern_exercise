/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: SingletonDemo.java
 * Brief: Program singleton demo
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */


package com.adam.app.singleton.pattern;

/**
 * @author AdamChen
 *
 */
public class SingletonDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        EagerInitialization eager = EagerInitialization.getInstance();
        eager.foo();
        
        StaticBlockInitialization staticBlock = StaticBlockInitialization.getInatnce();
        staticBlock.foo();
        
        LazyInitialization lazy = LazyInitialization.getInstance();
        lazy.foo();
        
        DCLP dclp = DCLP.getInstance();
        dclp.foo();
        
        BillPushSingleton bp = BillPushSingleton.getInstance();
        bp.foo();
        
        EnumSingleton enumObj = EnumSingleton.sINSTANCE;
        enumObj.foo();

    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

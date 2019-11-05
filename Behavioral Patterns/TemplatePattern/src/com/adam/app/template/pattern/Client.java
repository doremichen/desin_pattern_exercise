/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Client.java
 * Brief: Program template pattern
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */


package com.adam.app.template.pattern;

/**
 *
 * <h1>Client</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public class Client {
    
    /**
     * This is main method
     *
     * @param args Array of string
     * @return void
     */
    public static void main(String[] args) {
        // instance type A
        Template typeA = new TypeA();
        typeA.start();
        Utils.info(Client.class, "======================");
     // instance type B
        Template typeB = new TypeB();
        typeB.start();
    }
}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

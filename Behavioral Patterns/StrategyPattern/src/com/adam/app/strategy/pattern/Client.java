/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Client.java
 * Brief: Program strategy pattern
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */


package com.adam.app.strategy.pattern;

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
     * @param args Arrays of String
     * @return
     */
    public static void main(String[] args) {
        Utils.info(Client.class, "2+4 = " + Context.ADD.execute(2, 4));
        Utils.info(Client.class, "2-4 = " + Context.SUBSTRACTION.execute(2, 4));
        Utils.info(Client.class, "2<<4 = " + Context.SHIFTLEFT.execute(2, 4));
        Utils.info(Client.class, "2>>4 = " + Context.SHIFTRIGHT.execute(2, 4));
    }
    
    
}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

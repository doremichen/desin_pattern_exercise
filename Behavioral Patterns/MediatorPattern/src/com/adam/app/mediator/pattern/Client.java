/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Client.java
 * Brief: Program mediator pattern
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */

package com.adam.app.mediator.pattern;

/**
 * <h1>Client</h1>
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
     * @param args Array of String
     * @return
     */
    public static void main(String[] args) {
        // Create mediator
        SubSystemMediator mediator = new SubSystemMediator();
        // Create button
        Button button = new Button(mediator);
        Utils.info(Client.class, "Press 1 ====");
        button.press();
        Utils.info(Client.class, "Fan status: " + mediator.getFanStatus());
        Utils.info(Client.class, "Press 2 ====");
        button.press();
        Utils.info(Client.class, "Fan status: " + mediator.getFanStatus());

    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Client.java
 * Brief: Program MVC pattern
 * 
 * Author: AdamChen
 * Create Date: 2019/11/4
 */


package com.adam.app.mvc.pattern;

/**
 * @author AdamChen
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create model
        DataModel model = new DataModel("Default");
        // Create view
        DataView view = new DataView();
        // Create controller
        DataController controller = new DataController(model, view);
        
        // Show default model
        Utils.info(Client.class, model.toString());
        // modify model
        controller.modifyModel("Change data");
        // Show current model
        Utils.info(Client.class, model.toString());
        

    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

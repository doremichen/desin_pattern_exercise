/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Client.java
 * Brief: Program factory pattern
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */

package com.adam.app.factory.pattern;

/**
 * <h1>Client</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public class Client {

    /**
     * Entry method
     * 
     * @param
     * @return
     */
    public static void main(String[] args) {

        Pet pet1 = PetFactory.getPet(PetType.Dog);
        Pet pet2 = PetFactory.getPet(PetType.Cat);
        Pet pet3 = PetFactory.getPet(PetType.Pig);
        Pet pet4 = PetFactory.getPet(PetType.Snake);

        // show pet info
        Utils.info(Client.class, pet1.toString());
        Utils.info(Client.class, pet2.toString());
        Utils.info(Client.class, pet3.toString());
        Utils.info(Client.class, pet4.toString());

    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

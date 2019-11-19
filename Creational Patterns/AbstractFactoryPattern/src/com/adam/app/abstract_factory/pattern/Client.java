/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Client.java
 * Brief: Program abstract factory pattern
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */


package com.adam.app.abstract_factory.pattern;

/**
 *
 * <h1>Client</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public class Client {

    /**
     * Entry method
     * @param
     * @return
     */
    public static void main(String[] args) {
        // Big pet factory
        AbstractFactory factory1 = FactoryProducer.getFactory(FactoryProducer.Type.BIG);
        Utils.info(Client.class, "factory1: " + factory1.getClass().getSimpleName());
        // Small pet factory
        AbstractFactory factory2 = FactoryProducer.getFactory(FactoryProducer.Type.SMALL);
        Utils.info(Client.class, "factory2: " + factory2.getClass().getSimpleName());
        
        // generate pet via big factory
        Pet bigDog = factory1.getPet(PetType.Dog);
        Pet bigCat = factory1.getPet(PetType.Cat);
        Pet bigPig = factory1.getPet(PetType.Pig);
        Pet bigSnake = factory1.getPet(PetType.Snake);
        
     // generate pet via small factory
        Pet smallDog = factory2.getPet(PetType.Dog);
        Pet smallCat = factory2.getPet(PetType.Cat);
        Pet smallPig = factory2.getPet(PetType.Pig);
        Pet smallSnake = factory2.getPet(PetType.Snake);
        
        // show information
        Utils.info(Client.class, "Big pet as following...");
        Utils.info(Client.class, bigDog.toString());
        Utils.info(Client.class, bigCat.toString());
        Utils.info(Client.class, bigPig.toString());
        Utils.info(Client.class, bigSnake.toString());
        Utils.info(Client.class, "Small pet as following...");
        Utils.info(Client.class, smallDog.toString());
        Utils.info(Client.class, smallCat.toString());
        Utils.info(Client.class, smallPig.toString());
        Utils.info(Client.class, smallSnake.toString());

    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

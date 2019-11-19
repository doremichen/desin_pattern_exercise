/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: FactoryProducer.java
 * Brief: Factory producer
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */

package com.adam.app.abstract_factory.pattern;

/**
 * <h1>FactoryProducer</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public final class FactoryProducer {

    /**
     * Define factory type <h1>Type</h1>
     * <p>
     * 
     * @author AdamChen
     * @version
     * @since 2019/11/19
     */
    public static interface Type {
        String BIG = "big";
        String SMALL = "small";
    }

    /**
     * Generate specified factory via factory type
     * 
     * @param type This is from Factory Type
     * @return AbstractFactory
     */
    public static AbstractFactory getFactory(String type) {
        Utils.info(FactoryProducer.class, "getFactory: " + type);
        if (Type.BIG.equals(type)) {
            return new BigPetFactory();
        } else if (Type.SMALL.equals(type)) {
            return new SmallPetFactory();
        }

        throw new RuntimeException("No this type factory!!!");
    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: BigPetFactory.java
 * Brief: Big pet factory
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */


package com.adam.app.abstract_factory.pattern;

/**
 *
 * <h1>BigPetFactory</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public class BigPetFactory extends AbstractFactory {

    
    // Build pet map
    {
        this.mMap.put(PetType.Dog, new BigDog());
        this.mMap.put(PetType.Cat, new BigCat());
        this.mMap.put(PetType.Pig, new BigPig());
        this.mMap.put(PetType.Snake, new BigSnake());
    }
    
    /* (non-Javadoc)
     * @see com.adam.app.abstract_factory.pattern.AbstractFactory#getPet(com.adam.app.abstract_factory.pattern.PetType)
     */
    @Override
    public Pet getPet(PetType type) {
        return this.mMap.get(type);
    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

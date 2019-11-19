/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: SmallPetFactory.java
 * Brief: Small pet factory
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */


package com.adam.app.abstract_factory.pattern;

/**
 *
 * <h1>SmallPetFactory</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public class SmallPetFactory extends AbstractFactory {

    
    // Build pet map
    {
        this.mMap.put(PetType.Dog, new Dog());
        this.mMap.put(PetType.Cat, new Cat());
        this.mMap.put(PetType.Pig, new Pig());
        this.mMap.put(PetType.Snake, new Snake());
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

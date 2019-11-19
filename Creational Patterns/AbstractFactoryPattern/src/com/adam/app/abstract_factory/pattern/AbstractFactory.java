/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: AbstractFactory.java
 * Brief: This is abstract class
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */

package com.adam.app.abstract_factory.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>AbstractFactory</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public abstract class AbstractFactory {

    // pet map
    protected Map<PetType, Pet> mMap = new HashMap<PetType, Pet>();

    /**
     * Generate pet
     * 
     * @param type the pet type
     * @return Pet
     */
    public abstract Pet getPet(PetType type);

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

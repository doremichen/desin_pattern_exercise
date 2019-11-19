/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: PetFactory.java
 * Brief: Pet of factory
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */

package com.adam.app.factory.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>PetFactory</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public final class PetFactory {

    // Build pet map
    private static Map<PetType, Pet> sMap = new HashMap<PetType, Pet>();

    static {
        sMap.put(PetType.Dog, new Dog());
        sMap.put(PetType.Cat, new Cat());
        sMap.put(PetType.Pig, new Pig());
        sMap.put(PetType.Snake, new Snake());
    }

    /**
     * Generate pet
     * 
     * @param type The pet type
     * @return Pet
     */
    public static Pet getPet(PetType type) {
        return sMap.get(type);
    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

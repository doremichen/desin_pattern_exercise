/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: DataFactory.java
 * Brief: This is factory of data
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */


package com.adam.app.null_object.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * <h1>DataFactory</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public final class DataFactory {

    // Build data map
    private static Map<DataItem, AbstractData> sMap = new HashMap<DataItem, AbstractData>();
    
    static {
        sMap.put(DataItem.A, new ValidData("A"));
        sMap.put(DataItem.B, new ValidData("B"));
        sMap.put(DataItem.C, new ValidData("C"));
    }
    
    /**
     * Look up map and return the respective data
     *
     * @param item Data item
     * @return the respective data about data item
     */
    public static AbstractData getData(DataItem item) {
        // look up map
        AbstractData data = sMap.get(item);
        
        return (data != null)? data: new NullObject();
    }
    
}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

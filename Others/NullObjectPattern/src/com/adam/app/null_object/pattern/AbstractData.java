/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: AbstractData.java
 * Brief: This is abstract class
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */


package com.adam.app.null_object.pattern;

/**
 * @author AdamChen
 *
 */
public abstract class AbstractData {

    // data message
    protected String mMsg;
    
    /**
     * Get message from data object
     * 
     * @return
     */
    public abstract String getMsg();
    
    /**
     * Check the data object validation
     * 
     * @return true if the data object is validate <br>
     *         false if the data object is invalidate
     */
    public abstract boolean isNil();
}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

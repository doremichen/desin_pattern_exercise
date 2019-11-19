/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: NullObject.java
 * Brief: This is invalid data
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */


package com.adam.app.null_object.pattern;

/**
 *
 * <h1>NullObject</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public class NullObject extends AbstractData {

    /* (non-Javadoc)
     * @see com.adam.app.null_object.pattern.AbstractData#getMsg()
     */
    @Override
    public String getMsg() {
        return "Oh my god!!! this is invalid data";
    }

    /* (non-Javadoc)
     * @see com.adam.app.null_object.pattern.AbstractData#isNil()
     */
    @Override
    public boolean isNil() {
        return false;
    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: ValidData.java
 * Brief: This is valid data
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */


package com.adam.app.null_object.pattern;

/**
 *
 * <h1>ValidData</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public class ValidData extends AbstractData {
    
    /**
     * Construct
     * 
     * @param msg : The message of invalid data
     */
    public ValidData(String msg) {
        mMsg = msg;
    }
    

    /* (non-Javadoc)
     * @see com.adam.app.null_object.pattern.AbstractData#getMsg()
     */
    @Override
    public String getMsg() {
        return "Valid data: " + this.mMsg;
    }

    /* (non-Javadoc)
     * @see com.adam.app.null_object.pattern.AbstractData#isNil()
     */
    @Override
    public boolean isNil() {
        return true;
    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

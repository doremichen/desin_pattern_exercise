/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Constant.java
 * Brief: Constant expression
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */

package com.adam.app.interater.pattern;

/**
 * <h1>Constant</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public class Constant implements Expression {

    private final int mValue;

    /**
     * Constructor
     * 
     * @param value
     */
    public Constant(int value) {
        this.mValue = value;
    }

    /*
     * (non-Javadoc)
     * @see com.adam.app.interater.pattern.Expression#interpret(int)
     */
    @Override
    public int interpret() {
        Utils.info(this, "interpret");
        return this.mValue;
    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

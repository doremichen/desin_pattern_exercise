/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: ShiftRight.java
 * Brief: ShiftRight operator strategy
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */


package com.adam.app.strategy.pattern;

/**
 *
 * <h1>ShiftRight</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public class ShiftRight implements Strategy {

    /* (non-Javadoc)
     * @see com.adam.app.strategy.pattern.Strategy#operate(int, int)
     */
    @Override
    public int operate(int num1, int num2) {
        Utils.info(this, "operate");
        return num1 >> num2;
    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

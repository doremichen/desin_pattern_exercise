/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Strategy.java
 * Brief: Strategy interface
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */

package com.adam.app.strategy.pattern;

/**
 * <h1>Strategy</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public interface Strategy {

    /**
     * The operator of strategy
     * 
     * @param num1 the type is integer
     * @param num2 the type is integer
     * @return This vlaue is the result that is calculated by num1 and num2.
     */
    int operate(int num1, int num2);
}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

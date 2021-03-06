/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: AddExpression.java
 * Brief: Add expression
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */

package com.adam.app.interater.pattern;

/**
 * <h1>AddExpression</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public class AddExpression implements Expression {

    private final Expression mLeft;
    private final Expression mRight;

    public AddExpression(Expression left, Expression right) {
        this.mLeft = left;
        this.mRight = right;
    }

    /*
     * (non-Javadoc)
     * @see com.adam.app.interater.pattern.Expression#interpret()
     */
    @Override
    public int interpret() {
        Utils.info(this, "interpret");
        return this.mLeft.interpret() + this.mRight.interpret();
    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

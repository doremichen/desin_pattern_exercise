/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Client.java
 * Brief: Program Interpret pattern
 * 
 * Author: AdamChen
 * Create Date: 2019/11/19
 */

package com.adam.app.interater.pattern;

/**
 * <h1>Client</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/19
 */
public class Client {

    /**
     * Entry method
     * 
     * @param
     * @return
     */
    public static void main(String[] args) {
        // (2+1)x3
        final Expression sumExp = new AddExpression(new Constant(2),
                new Constant(1));
        final Expression resultExp = new MultipleExpression(sumExp,
                new Constant(3));

        final int result = resultExp.interpret();
        Utils.info(Client.class, "(2+1)x3 = " + result);

    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

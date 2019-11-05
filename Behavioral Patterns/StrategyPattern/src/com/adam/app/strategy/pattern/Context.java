/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Context.java
 * Brief: Handle strategy operator
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */


package com.adam.app.strategy.pattern;

/**
 *
 * <h1>Context</h1>
 * This is context of operation strategy
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public enum Context {
    ADD {

        @Override
        public int execute(int num1, int num2) {
             return new Addition().operate(num1, num2);
        }
        
    },
    SUBSTRACTION {

        @Override
        public int execute(int num1, int num2) {
            return new Substraction().operate(num1, num2);
            
        }
        
    },
    SHIFTLEFT {

        @Override
        public int execute(int num1, int num2) {
            return new ShiftLeft().operate(num1, num2);
            
        }
        
    },
    SHIFTRIGHT {

        @Override
        public int execute(int num1, int num2) {
            return new ShiftRight().operate(num1, num2);
            
        }
        
    };
    
    
    public abstract int execute(int num1, int num2);
}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

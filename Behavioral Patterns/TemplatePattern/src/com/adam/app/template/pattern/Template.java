/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Template.java
 * Brief: This is template class
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */


package com.adam.app.template.pattern;

/**
 * 
 *
 * <h1>Template</h1>
 *     Provide the initial, action and end abstract method
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public abstract class Template {
    
    // Implemented by subclass
    /**
     * This is abstract method
     *
     * @param N/A
     * @return void
     */
    protected abstract void initialize();
    
    /**
     * This is abstract method
     *
     * @param N/A
     * @return void
     */
    protected abstract void act();
    
    /**
     * This is abstract method
     *
     * @param N/A
     * @return void
     */
    protected abstract void release();
    

    /**
     * This method is start process
     *
     * @param: N/A
     * @return: void
     */
    public final void start() {
        initialize();
        act();
        release();
    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

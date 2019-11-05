/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: TypeB.java
 * Brief: This is type B of template class
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */


package com.adam.app.template.pattern;

/**
 *
 * <h1>TypeB</h1>
 *
 * <p>
 *
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public class TypeB extends Template {

    /* (non-Javadoc)
     * @see com.adam.app.template.pattern.Template#initialize()
     */
    @Override
    protected void initialize() {
        Utils.info(this, "initialize");

    }

    /* (non-Javadoc)
     * @see com.adam.app.template.pattern.Template#act()
     */
    @Override
    protected void act() {
        Utils.info(this, "act");

    }

    /* (non-Javadoc)
     * @see com.adam.app.template.pattern.Template#release()
     */
    @Override
    protected void release() {
        Utils.info(this, "release");

    }

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

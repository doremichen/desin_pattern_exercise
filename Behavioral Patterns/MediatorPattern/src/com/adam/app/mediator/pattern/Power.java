/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Power.java
 * Brief: This is power device
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */

package com.adam.app.mediator.pattern;

/**
 * <h1>Power</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public class Power implements Subsystem {

    /*
     * (non-Javadoc)
     * @see com.adam.app.mediator.pattern.Subsystem#turnOn()
     */
    @Override
    public void turnOn() {
        Utils.info(this, "turnOn");

    }

    /*
     * (non-Javadoc)
     * @see com.adam.app.mediator.pattern.Subsystem#turnOff()
     */
    @Override
    public void turnOff() {
        Utils.info(this, "turnOff");

    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

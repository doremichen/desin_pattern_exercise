/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Fan.java
 * Brief: This is fan device
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */

package com.adam.app.mediator.pattern;

/**
 * <h1>Fan</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public class Fan implements Subsystem {

    private boolean mIsOn;

    /*
     * (non-Javadoc)
     * @see com.adam.app.mediator.pattern.Subsystem#turnOn()
     */
    @Override
    public void turnOn() {
        Utils.info(this, "turnOn");
        mIsOn = true;

    }

    /*
     * (non-Javadoc)
     * @see com.adam.app.mediator.pattern.Subsystem#turnOff()
     */
    @Override
    public void turnOff() {
        Utils.info(this, "turnOff");
        mIsOn = false;

    }

    /**
     * Get power status
     * 
     * @param
     * @return
     */
    public boolean getStatus() {
        return this.mIsOn;
    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

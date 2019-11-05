/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: SubSystemMediator.java
 * Brief: The mediator of subsystem
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */

package com.adam.app.mediator.pattern;

/**
 * <h1>SubSystemMediator</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public class SubSystemMediator {

    private boolean mIsOn;

    // subsystem
    private Power mPower = new Power();
    private Fan mFan = new Fan();

    /**
     * start fan
     * 
     * @param
     * @return
     */
    public void startFan() {
        Utils.info(this, "startFan");
        // chack power on status
        if (this.mIsOn == false) {
            // turn on power
            this.mPower.turnOn();
            // turn on fan
            this.mFan.turnOn();
            // set on flag is true
            this.mIsOn = true;
        } else {
            // show the device has power on
            Utils.info(this, "Device has powered on");
        }
    }

    /**
     * Stop fan
     * 
     * @param
     * @return
     */
    public void stopFan() {
        Utils.info(this, "stopFan");
        // chack power on status
        if (this.mIsOn == true) {
            // turn off fan
            this.mFan.turnOff();
            // turn off power
            this.mPower.turnOff();
            // set on flag is false
            this.mIsOn = false;
        } else {
            // show the device has power off
            Utils.info(this, "Device has powered off");
        }
    }

    /**
     * Get fan power status
     * 
     * @param
     * @return
     */
    public boolean getFanStatus() {
        return this.mFan.getStatus();
    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

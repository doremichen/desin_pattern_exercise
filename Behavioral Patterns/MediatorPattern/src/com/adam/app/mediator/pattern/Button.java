/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: Button.java
 * Brief: UI interface
 * 
 * Author: AdamChen
 * Create Date: 2019/11/5
 */

package com.adam.app.mediator.pattern;

/**
 * <h1>Button</h1>
 * <p>
 * 
 * @author AdamChen
 * @version
 * @since 2019/11/5
 */
public class Button {

    // subsystem mediator
    private SubSystemMediator mMediator;

    private boolean mIsStartFan;

    public Button(SubSystemMediator mediator) {
        this.mMediator = mediator;
    }

    /**
     * press button
     * 
     * @param
     * @return
     */
    public void press() {
        Utils.info(this, "press");
        // check start fan flag
        if (this.mIsStartFan == false) {
            this.mMediator.startFan();
            this.mIsStartFan = true;
        } else {
            this.mMediator.stopFan();
            this.mIsStartFan = false;
        }
    }

}

/*
 * ===========================================================================
 * Revision history
 * ===========================================================================
 */

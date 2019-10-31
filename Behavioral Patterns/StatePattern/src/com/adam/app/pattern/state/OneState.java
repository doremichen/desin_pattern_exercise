/** 
 * This is state pattern example
 */

package com.adam.app.pattern.state;

public class OneState implements IState {

    @Override
    public void doAction() {
        Utils.info(">>>> One state <<<<");

    }
}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

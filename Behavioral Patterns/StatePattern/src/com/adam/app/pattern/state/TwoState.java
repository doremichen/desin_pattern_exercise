/**
 * This is state pattern example
 */

package com.adam.app.pattern.state;

public class TwoState implements IState {

    @Override
    public void doAction() {
        Utils.info(">>>> Two state <<<<");

    }
}

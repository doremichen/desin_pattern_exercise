package com.adam.app.pattern.state;

public class ExitState implements IState {

    @Override
    public void doAction() {
        Utils.info(">>>> Exit state <<<<");

    }

}

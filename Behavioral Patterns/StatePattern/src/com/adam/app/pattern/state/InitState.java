package com.adam.app.pattern.state;

public class InitState implements IState {

    @Override
    public void doAction() {
        Utils.info(">>>> Init state <<<<");

    }

}

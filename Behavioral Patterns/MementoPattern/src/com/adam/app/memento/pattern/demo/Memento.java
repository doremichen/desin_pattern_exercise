/**
 * record the state of originator 
 */

package com.adam.app.memento.pattern.demo;

public class Memento {

    private String mState;

    public Memento(String stateToSave) {
        mState = stateToSave;
    }

    public String getSavedState() {
        return mState;
    }

}

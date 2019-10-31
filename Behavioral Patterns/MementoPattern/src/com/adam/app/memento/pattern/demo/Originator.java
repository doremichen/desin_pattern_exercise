/**
 * This is Memento pattern example
 */

package com.adam.app.memento.pattern.demo;

public class Originator {

    private String mState;

    public void set(String state) {
        info(this, "set state to " + state);
        this.mState = state;
    }

    public Memento saveToMemento() {
        info(this, "save to memento: " + this.mState);
        return new Memento(mState);
    }

    public void restoreFromMemento(Memento m) {
        this.mState = m.getSavedState();
        info(this, "state after restoring from memento: " + this.mState);
    }
    
    private void info(Object obj, String str) {
        System.out.println(obj.getClass().getSimpleName() + ": " + str);
    }

}

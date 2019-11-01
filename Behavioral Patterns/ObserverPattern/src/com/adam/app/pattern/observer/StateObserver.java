/**
 * State observer
 */

package com.adam.app.pattern.observer;

public class StateObserver implements Observer {

    private String mName = null;

    public StateObserver(String str) {
        mName = str;
    }

    @Override
    public void update(String msg) {
        Utils.info(this, "update");
        if (msg == null) {
            Utils.info(this, "No changed");
        } else {
            Utils.info(this, this.mName + " is changed by " + msg);
        }

    }

}

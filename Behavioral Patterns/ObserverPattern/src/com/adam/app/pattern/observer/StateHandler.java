/**
 * Oberverable subject
 */

package com.adam.app.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class StateHandler implements Subject {

    // record observer
    private final List<Observer> mObservers;
    private String mMessage;
    private boolean mStatusChange;

    public StateHandler() {
        mObservers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer object) {

        if (object == null) {
            throw new NullPointerException("Null object");
        }

        synchronized (this) {
            if (!mObservers.contains(object)) {
                mObservers.add(object);
            }
        }
    }

    @Override
    public void unregister(Observer object) {

        synchronized (this) {
            mObservers.remove(object);
        }

    }

    @Override
    public void notifyObservers() {
        List<Observer> localList = null;

        // make sure any observer registered after message
        synchronized (this) {
            if (!mStatusChange) {
                return;
            }

            // copy list to prevent from data corrupt condition
            localList = new ArrayList<Observer>(mObservers);
        }

        // invoke observer update
        for (final Observer object : localList) {
            object.update(mMessage);
        }

    }

    public void chageState(String msg) {
        Utils.info(this, "chageState: " + msg);
        mMessage = msg;
        mStatusChange = true;
        notifyObservers();
    }

}

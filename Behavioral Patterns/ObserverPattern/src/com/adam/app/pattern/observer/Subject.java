/**
 * Observerable Subject Interface
 */

package com.adam.app.pattern.observer;

public interface Subject {
    // methods to register/unregister observers
    void register(Observer object);

    void unregister(Observer object);

    // methods to notify observers of change
    void notifyObservers();
}

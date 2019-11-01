/**
 * Observer subject and wait for notify
 */

package com.adam.app.pattern.observer;

public interface Observer {
    // update the observer, used for Subject
    void update(String msg);
}

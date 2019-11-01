/**
 * Program Observer pattern
 */

package com.adam.app.pattern.observer;

public class TestObserverPattern {

    public static void main(String[] args) {

        // create state handler
        final StateHandler sh = new StateHandler();

        // create state observer
        final StateObserver stobs1 = new StateObserver("one");
        final StateObserver stobs2 = new StateObserver("two");

        // register state observer to state handler
        Utils.info(TestObserverPattern.class, "Register One and two observer");
        sh.register(stobs1);
        sh.register(stobs2);

        // change state
        sh.chageState("Active");

        // unregister state observer from state handler
        Utils.info(TestObserverPattern.class, "Unregister One observer");
        sh.unregister(stobs1);

        // change state
        sh.chageState("Suspend");

    }

}

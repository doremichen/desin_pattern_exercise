/**
 * Program memento pattern
 */

package com.adam.app.memento.pattern.demo;

public class MementoDemo {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        // set state of originator
        originator.set("state A");
        originator.set("state B");
        originator.set("state B_1");
        // add new memento
        caretaker.addMemento(originator.saveToMemento());
        originator.set("state C");
        caretaker.addMemento(originator.saveToMemento());
        originator.set("state D");
        caretaker.addMemento(originator.saveToMemento());
        // restore state of originator from memento
        originator.restoreFromMemento(caretaker.getMemnto(1));

        // dump memento
        info(MementoDemo.class, "==== dump memento ====");
        caretaker.dumpMemento();

    }

    private static void info(Class<?> clazz, String str) {
        System.out.println(clazz.getSimpleName() + ": " + str);
    }

}

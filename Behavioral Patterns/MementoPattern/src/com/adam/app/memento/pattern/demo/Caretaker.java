/**
 * Provider add memento and get memento
 */

package com.adam.app.memento.pattern.demo;

import java.util.ArrayList;

public class Caretaker {

    private ArrayList<Memento> saveStates = new ArrayList<Memento>();

    public void addMemento(Memento m) {
        saveStates.add(m);
    }

    public Memento getMemnto(int index) {
        return saveStates.get(index);
    }
    
    public void dumpMemento() {
        for (Memento memento: saveStates) {
            info(this, memento.getSavedState());
        }
    }
    
    private void info(Object obj, String str) {
        System.out.println(obj.getClass().getSimpleName() + ": " + str);
    }

}

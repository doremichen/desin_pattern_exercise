/**
 * Program Composite pattern
 */

package com.adam.app.pattern.composit;

public class CompositePatternDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        LeafOne lfOne = new LeafOne();
        LeafTwo lfTwo = new LeafTwo();

        // Create root node
        Composite root = new Composite();

        root.add(lfOne);
        root.add(lfTwo);

        // Create subNode
        Composite subRoot1 = new Composite();
        subRoot1.add(lfOne);
        root.add(subRoot1);

        // Create subNode
        Composite subRoot2 = new Composite();
        root.add(subRoot2);

        root.doProcess("run");

    }

}

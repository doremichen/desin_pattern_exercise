/**
 * 
 * Leaf component
 * 
 */

package com.adam.app.pattern.composit;

public class LeafTwo implements IComponent {

    @Override
    public void doProcess(String action) {

        Util.info(this, "run");

    }

}

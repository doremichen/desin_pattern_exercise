/**
 * 
 * Leaf component
 * 
 */

package com.adam.app.pattern.composit;

public class LeafOne implements IComponent {

    @Override
    public void doProcess(String action) {
        Util.info(this, "run");

    }

}

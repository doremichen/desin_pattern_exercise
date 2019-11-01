/**
 * Node that handle to composite component
 */

package com.adam.app.pattern.composit;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

    private List<IComponent> mComps = new ArrayList<IComponent>();

    @Override
    public void doProcess(String action) {
        Util.info(this, "doProcess");
        if (mComps.size() == 0) {
            Util.info(this, "No leaf");
            return;
        }

        for (IComponent comp : mComps) {
            comp.doProcess(action);
        }

    }

    /**
     * 
     * Add component
     * 
     * @param comp
     */
    public void add(IComponent comp) {
        mComps.add(comp);
    }

    /**
     * 
     * Remove component
     * 
     * @param comp
     */
    public void remove(IComponent comp) {
        mComps.remove(comp);
    }

    /**
     * 
     * Clear component
     * 
     */
    public void clear() {
        mComps.clear();
    }

}

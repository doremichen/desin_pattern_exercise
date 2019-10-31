/**
 *  Interface of range would handle the constraint operation
 */

package com.adam.app.range.pattern;

/**
 * @author AdamChen
 * 
 */
public abstract class Range {

    private Range mNext;

    /**
     * 
     * Add next range
     * 
     * @param next
     */
    public final void AddNext(Range next) {
        this.mNext = next;
    }

    abstract int onMin();

    abstract int onMax();

    /**
     * Check the range of value
     * 
     * @param value
     * @return
     */
    private boolean in(int value) {

        if (value >= onMin() && value <= onMax()) {
            return true;
        }

        return false;
    }

    /**
     * 
     * The process of chain
     * 
     * @param value
     */
    public final void hanlder(int value) {
        boolean ret = this.in(value);

        if (ret == false) {
            // Check whether next range exist or not ?
            if (mNext == null) {
                throw new RuntimeException("No next range");
            }

            mNext.hanlder(value);
        } else {

            Utils.info(Range.class, "Locate in range " + this.getClass().getSimpleName());

        }

    }

}

/**
 * 
 */

package com.adam.app.range.pattern;

/**
 * @author AdamChen
 * 
 */
public class D extends Range {

    private int mMax;
    private int mMin;
    
    public D(int max, int min) {
        this.mMax = max;
        this.mMin = min;
    }
    
    
    @Override
    int onMin() {
        return this.mMin; //31;
    }

    @Override
    int onMax() {
        return this.mMax; //40;
    }

}

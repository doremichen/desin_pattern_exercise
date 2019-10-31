/**
 * 
 */

package com.adam.app.range.pattern;

/**
 * @author AdamChen
 * 
 */
public class B extends Range {

    
    private int mMax;
    private int mMin;
    
    public B(int max, int min) {
        this.mMax = max;
        this.mMin = min;
    }
    
    @Override
    int onMin() {
        return this.mMin; //11;
    }

    @Override
    int onMax() {
        return this.mMax; //20;
    }

}

/**
 * 
 */

package com.adam.app.range.pattern;

/**
 * @author AdamChen
 * 
 */
public class C extends Range {

    
    private int mMax;
    private int mMin;
    
    public C(int max, int min) {
        this.mMax = max;
        this.mMin = min;
    }
    
    @Override
    int onMin() {
        return this.mMin; //21;
    }

    @Override
    int onMax() {
        return this.mMax; //30;
    }

}

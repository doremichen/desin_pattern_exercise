/**
 * 
 */

package com.adam.app.range.pattern;

/**
 * @author AdamChen
 * 
 */
public class A extends Range {

    
    private int mMax;
    private int mMin;
    
    public A(int max, int min) {
        this.mMax = max;
        this.mMin = min;
    }
    
    
    @Override
    int onMin() {
        return this.mMin; //0;
    }

    @Override
    int onMax() {
        return this.mMax; //10;
    }

}

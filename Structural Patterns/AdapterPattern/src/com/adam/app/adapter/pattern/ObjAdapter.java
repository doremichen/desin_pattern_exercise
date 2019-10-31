/**
 * 
 */
package com.adam.app.adapter.pattern;

/**
 * @author AdamChen
 * 
 */
public class ObjAdapter implements IAdapter {

    private Adaptee mAdaptee = new Adaptee();

    @Override
    public int getValue1() {
        return mAdaptee.getValue() / 200;
    }

    @Override
    public int getValue2() {
        return mAdaptee.getValue() / 150;
    }

    @Override
    public int getValue3() {
        return mAdaptee.getValue() / 250;
    }

}

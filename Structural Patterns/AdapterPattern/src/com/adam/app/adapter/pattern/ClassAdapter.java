/**
 * 
 */
package com.adam.app.adapter.pattern;

/**
 * @author AdamChen
 * 
 */
public class ClassAdapter extends Adaptee implements IAdapter {

    @Override
    public int getValue1() {

        return super.getValue() / 100;

    }

    @Override
    public int getValue2() {

        return super.getValue() / 50;

    }

    @Override
    public int getValue3() {

        return super.getValue() / 200;

    }

}

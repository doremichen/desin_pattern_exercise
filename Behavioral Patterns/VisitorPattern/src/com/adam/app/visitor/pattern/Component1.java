/**
 * Component1 has two data member
 * 
 * @author AdamChen
 */

package com.adam.app.visitor.pattern;

public class Component1 implements ITarget {
    
    private int mData1;
    private int mData2;
    
    public Component1(int value1, int value2) {
        this.mData1 = value1;
        this.mData2 = value2;
    }
    
    public int getData1() {
        return this.mData1;
    }
    
    public int getData2() {
        return this.mData2;
    }

    public int accept(IVisitor visitor) {
        Utils.info(this, "accept");
        return visitor.visit(this);
    }

}

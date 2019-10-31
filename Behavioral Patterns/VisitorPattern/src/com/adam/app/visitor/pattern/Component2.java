/**
 * Component2 has three data member
 * 
 * @author AdamChen
 */

package com.adam.app.visitor.pattern;

public class Component2 implements ITarget {
    
    private int mData1;
    private int mData2;
    private int mData3;
    
    public Component2(int value1, int value2, int value3) {
        this.mData1 = value1;
        this.mData2 = value2;
        this.mData3 = value3;
    }
    
    public int getData1() {
        return this.mData1;
    }
    
    public int getData2() {
        return this.mData2;
    }
    
    public int getData3() {
        return this.mData3;
    }
    

    public int accept(IVisitor visitor) {
        Utils.info(this, "accept");
        return visitor.visit(this);
    }

}

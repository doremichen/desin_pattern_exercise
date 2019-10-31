/**
 * The main purpose of ConcreteVisitor is that handle
 * the operation process about the visit target
 * 
 * @author AdamChen
 */

package com.adam.app.visitor.pattern;

public class ConcreteVisitor implements IVisitor {

    public int visit(ITarget target) {
        Utils.info(this, "visit");
        int ret = 0;
        if (target instanceof Component1) {
            Component1 cmp1 = (Component1)target;
            ret = cmp1.getData1() * cmp1.getData2();
            
        } else if (target instanceof Component2) {
            Component2 cmp2 = (Component2)target;
            if (cmp2.getData1() > 10) {
                ret = cmp2.getData2() + cmp2.getData3();
            } else {
                ret = cmp2.getData2() - cmp2.getData3();
            }
        }
        Utils.info(this, "visit: ret = " + ret);
        return ret;
    }

}

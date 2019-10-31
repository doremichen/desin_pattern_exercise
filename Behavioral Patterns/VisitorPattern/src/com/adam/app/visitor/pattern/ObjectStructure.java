/**
 * ObjectStructure is mediator interface
 * 
 * @author AdamChen
 */

package com.adam.app.visitor.pattern;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    
    private static List<ITarget> sList = new ArrayList<ITarget>();
    
    static {
        sList.add(new Component1(12, 54));
        sList.add(new Component2(6, 23, 9));
        sList.add(new Component2(15, 2, 34));
    }
    
    /**
     * Start calculate target data
     * 
     * @return the value is calculated by visitor
     */
    public static int startCalculate() {
        Utils.info(ObjectStructure.class, "startCalculate");
        
        int sum = 0;
        
        // initial visitor
        ConcreteVisitor visitor = new ConcreteVisitor();
        // Injection target
        for (int i = 0; i < sList.size(); i++) {
            sum += sList.get(i).accept(visitor);
        }
        
        return sum;
    }

}

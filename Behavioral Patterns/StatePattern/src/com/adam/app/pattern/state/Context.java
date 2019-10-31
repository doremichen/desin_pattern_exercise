/**
 * This is state pattern example
 */

package com.adam.app.pattern.state;

import java.util.ArrayList;
import java.util.List;

public class Context {

    private static List<IState> sList = new ArrayList<IState>();
    
    // build state list
    static {
        sList.add(new InitState());
        sList.add(new OneState());
        sList.add(new TwoState());
        sList.add(new ExitState());
    }
    
    /**
     * Start to transfer state
     */
    public static void start() {
        for (IState state: sList) {
            state.doAction();
            // delay 1 sec
            Utils.delay(1000L);
        }
    }
    

}

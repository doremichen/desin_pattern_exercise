/**
 * Tool set
 */
package com.adam.app.pattern.state;

public final class Utils {
    
    public static void info(String msg) {
        System.out.println(msg);
    }
    
    public static void delay(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

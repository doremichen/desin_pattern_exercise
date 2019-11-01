/**
 * Provide tool set
 */

package com.adam.app.pattern.composit;

public final class Util {

    /**
     * log information
     * 
     * @param obj
     * @param str
     */
    public static void info(Object obj, String str) {
        System.out.println(obj.getClass().getSimpleName() + ": " + str);
    }

}

/**
 * Provide log information method
 */

package com.adam.app.decorator.pattern;

public final class Utils {

    /**
     * 
     * Apply to object
     * 
     * @param obj
     * @param str
     */
    public static void print(Object obj, String str) {
        System.out.println(obj.getClass().getSimpleName() + " " + str);
    }

    /**
     * 
     * Apply to static class
     * 
     * @param clazz
     * @param str
     */
    public static void print(Class<?> clazz, String str) {
        System.out.println(clazz.getSimpleName() + " " + str);
    }

}

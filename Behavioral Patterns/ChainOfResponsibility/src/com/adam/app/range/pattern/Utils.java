/**
 * Tool set
 */

package com.adam.app.range.pattern;

public final class Utils {

    public static void info(Object obj, String str) {
        System.out.println(obj.getClass().getSimpleName() + ": " + str);
    }
    
    public static void info(Class<?> clazz, String str) {
        System.out.println(clazz.getSimpleName() + ": " + str);
    }
}

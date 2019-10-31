/**
 * Just tool set
 * 
 * @author AdamChen
 */

package com.adam.app.visitor.pattern;

public abstract class Utils {
        public static void info(Object obj, String str) {
            System.out.println(obj.getClass().getSimpleName() + ": " + str);
        }
        
        public static void info(Class<?> clazz, String str) {
            System.out.println(clazz.getSimpleName() + ": " + str);
        }
}

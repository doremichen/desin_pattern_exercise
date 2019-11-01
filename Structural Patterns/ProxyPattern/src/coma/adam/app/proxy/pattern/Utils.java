/**
 * Utils class
 */

package coma.adam.app.proxy.pattern;

public final class Utils {

    public static void print(Object obj, String str) {
        System.out.println(obj.getClass().getSimpleName() + ": " + str);
    }

    public static void print(Class<?> clazz, String str) {
        System.out.println(clazz.getSimpleName() + ": " + str);
    }

}

/**
 * This is for sample
 */

package com.adam.app.pattern.flywieght;

import java.util.HashMap;

/**
 * @author AdamChen
 * 
 */
public abstract class PencilFactory {
    private static final HashMap<String, Pen> map = new HashMap<String, Pen>();

    public static Pen getPencel(String style) {
        Utils.info(PencilFactory.class, "getPencel");
        Pencil pen = (Pencil) map.get(style);

        // Put in map if the pen is not in map
        if (pen == null) {
            pen = new Pencil(style);
            map.put(style, pen);
        }

        return pen;
    }
}

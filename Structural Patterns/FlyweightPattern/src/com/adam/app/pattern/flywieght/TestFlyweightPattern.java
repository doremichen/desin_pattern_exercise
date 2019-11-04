/**
 * this is for sample
 */

package com.adam.app.pattern.flywieght;

public class TestFlyweightPattern {

    private static final String[] COLORS = { "red", "blue", "black", "green" };

    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    public static void main(String[] args) {

        // config pencel style and show pencil style
        for (int i = 0; i < 20; i++) {
            final String style = getRandomColor();
            final Pencil pencil = (Pencil) PencilFactory.getPencel(style);
            pencil.setStyle(style);
            pencil.printStyle();
        }
    }

}

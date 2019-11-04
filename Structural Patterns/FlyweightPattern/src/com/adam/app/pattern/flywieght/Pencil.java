/**
 * Concrete implementation of Pen
 */

package com.adam.app.pattern.flywieght;

public class Pencil implements Pen {

    private String mStyle;

    public Pencil(String style) {
        Utils.info(this, "Create: " + style);
        this.mStyle = style;
    }

    public void setStyle(String str) {
        mStyle = str;
    }

    @Override
    public void printStyle() {
        Utils.info(this, "This is " + this.mStyle + " pencel.");
    }

}

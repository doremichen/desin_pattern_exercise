/**
 * Circle class
 */

package com.adam.app.decorator.pattern;

public class Circle implements IShape {

    @Override
    public void draw() {
        Utils.print(this, "draw");
    }

}

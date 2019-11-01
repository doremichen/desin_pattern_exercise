/**
 * Square class
 */

package com.adam.app.decorator.pattern;

public class Square implements IShape {

    @Override
    public void draw() {
        Utils.print(this, "draw");
    }

}

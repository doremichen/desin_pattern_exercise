/**
 * The decorator of the shape
 */

package com.adam.app.decorator.pattern;

public class ShapeDecorector implements IShape {

    private IShape mShape;

    public ShapeDecorector(IShape shape) {
        this.mShape = shape;
    }

    @Override
    public void draw() {
        this.mShape.draw();
        addComponent();
    }

    private void addComponent() {
        Utils.print(this, "Add componet");
    }

}

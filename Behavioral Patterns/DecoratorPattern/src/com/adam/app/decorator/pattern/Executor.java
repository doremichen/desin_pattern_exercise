/**
 * Program decorator pattern
 */

package com.adam.app.decorator.pattern;

public class Executor {

    public static void main(String[] args) {

        // Circle object
        Circle circle = new Circle();

        // Square object
        Square square = new Square();

        // Decorator of the circle
        IShape decorator_circle = new ShapeDecorector(circle);

        // Decorator of the square
        IShape decorator_square = new ShapeDecorector(square);

        // Draw
        decorator_circle.draw();
        decorator_square.draw();
    }

}

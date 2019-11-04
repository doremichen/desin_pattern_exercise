/**
 * Implementation 1
 */

package com.adam.app.pattern.bridge;

public class LibA implements APIProvide {

    @Override
    public void foo(int x, int y) {
        Utils.info(this, "foo(" + x + ", " + y + ")");
    }

}

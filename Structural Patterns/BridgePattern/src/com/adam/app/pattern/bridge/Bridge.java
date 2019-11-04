/**
 * Concrete of abstract concept
 */

package com.adam.app.pattern.bridge;

public class Bridge extends BridgeGenerate {

    private int mX = 0;
    private int mY = 0;

    public Bridge(int x, int y, APIProvide provide) {
        super(provide);
        mX = x;
        mY = y;
    }

    @Override
    public void foo() {
        mProvide.foo(mX, mY);
    }

}

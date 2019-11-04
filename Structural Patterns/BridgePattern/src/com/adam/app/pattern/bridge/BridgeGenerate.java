/**
 * Bridge Interface
 */

package com.adam.app.pattern.bridge;

public abstract class BridgeGenerate {

    protected APIProvide mProvide = null;

    public BridgeGenerate(APIProvide provide) {
        mProvide = provide;
    }

    public abstract void foo();
}

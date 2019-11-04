/**
 * Program bridge pattern
 */

package com.adam.app.pattern.bridge;

public class TestBridgePattern {

    public static void main(String[] args) {

        // Create bridge
        final BridgeGenerate libA = new Bridge(10, 20, new LibA());
        final BridgeGenerate libB = new Bridge(20, 10, new LibB());

        // invoke foo method
        libA.foo();
        libB.foo();

    }

}

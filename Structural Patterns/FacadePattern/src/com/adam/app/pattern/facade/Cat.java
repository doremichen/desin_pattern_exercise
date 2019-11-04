/**
 * Cat animal
 */

package com.adam.app.pattern.facade;

public class Cat implements Animal {

    @Override
    public void Hello() {
        Utils.info(this, "Hello");
    }

}

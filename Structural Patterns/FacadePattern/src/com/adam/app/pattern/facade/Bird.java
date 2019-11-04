/**
 * Bird animal
 */

package com.adam.app.pattern.facade;

public class Bird implements Animal {

    @Override
    public void Hello() {
        Utils.info(this, "Hello");
    }

}

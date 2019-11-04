/**
 * Dog animal
 */

package com.adam.app.pattern.facade;

public class Dog implements Animal {

    @Override
    public void Hello() {
        Utils.info(this, "Hello");
    }

}

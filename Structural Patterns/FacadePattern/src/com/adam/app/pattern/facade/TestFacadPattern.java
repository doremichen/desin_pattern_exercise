/**
 * Program facade pattern
 */

package com.adam.app.pattern.facade;

public class TestFacadPattern {

    public static void main(String[] args) {
        final AnimalFacade maker = new AnimalFacade();

        maker.helloBird();
        maker.helloCat();
        maker.helloDog();

    }

}

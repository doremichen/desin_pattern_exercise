/**
 * animal facade
 */

package com.adam.app.pattern.facade;

public class AnimalFacade {
    private Bird bird;
    private Cat cat;
    private Dog dog;

    public AnimalFacade() {
        bird = new Bird();
        cat = new Cat();
        dog = new Dog();
    }

    public void helloBird() {
        Utils.info(this, "helloBird");
        bird.Hello();
    }

    public void helloCat() {
        Utils.info(this, "helloCat");
        cat.Hello();
    }

    public void helloDog() {
        Utils.info(this, "helloDog");
        dog.Hello();
    }
}

package entity.group;

import behavior.animal.AnimalBehavior;
import entity.animal.Animal;

class AnimalGroup<T extends Animal> extends Group<T> implements AnimalBehavior {
    public AnimalGroup(T t, int number) {
        super(t, number);
    }


    @Override
    public void speak() {
        print("" + count + " times echoed the voice: see next line");
        entity.speak();
    }

    @Override
    public void move() {
        print("" + count + " bodies are moving together: see next line");
        entity.move();
    }
}
package entity.animal.template;

import entity.Entity;
import entity.animal.behavior.AnimalBehavior;

abstract class Animal extends Entity implements AnimalBehavior{
    Animal() {
        super();
    }

    protected Animal(String name) {
        super(name);
    }
}

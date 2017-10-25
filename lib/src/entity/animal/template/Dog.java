package entity.animal.template;

import entity.animal.Animal;
import entity.animal.AnimalType;

public class Dog extends Animal {
    public Dog() {
        super();
        animalType = AnimalType.dog;
    }

    public Dog(boolean sex) {
        super(sex);
    }

    @Override
    public void speak() {
        print("Wang! Wang! Wang!");
    }

    @Override
    public void move() {
        print("Very fast.");
    }

    @Override
    public Animal purchaseAgain() {
        return new Dog();
    }
}

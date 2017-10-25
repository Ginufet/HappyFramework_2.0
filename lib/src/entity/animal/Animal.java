package entity.animal;

import behavior.animal.AnimalBehavior;
import entity.Entity;
import entity.Product;
import entity.group.Group;

public abstract class Animal extends Entity implements AnimalBehavior {
//    protected AnimalType animalType;

    protected boolean sex;
    protected boolean pregnant;
    protected String name;
    protected double life;

    protected Animal(String name, boolean sex, double life, boolean pregnant) {
        this.name = name;
        this.life = life;
        this.sex = sex;
        this.pregnant = pregnant;
    }

    protected Animal(String name, boolean sex, double life) {
        this(name, sex, life, false);
    }

    protected Animal(String name, boolean sex) {
        this(name, sex, 100, false);
    }

    protected Animal(String name) {
        this(name, true,100, false);
    }

    public Animal() {
        this("", true,100,false);
    }

    public boolean isMale() {
        return sex;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void makePregnant() {
        pregnant = true;
    }

//    public AnimalType getAnimalType() {
//        return animalType;
//    }

    abstract public Animal purchaseAgain();
}

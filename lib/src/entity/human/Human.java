package entity.human;

import behavior.Performable;
import entity.Entity;

public abstract class Human extends Entity implements Performable {

    protected String name;
    protected boolean sex;
    protected double age;

    protected Human(String name, boolean sex) {
        this(name, sex ,28);
    }

    protected Human(String name, boolean sex, double age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    @Override
    public void performAction() {

    }

}

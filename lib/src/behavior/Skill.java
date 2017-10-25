package behavior;

import application.Printable;

public abstract class Skill implements Performable, Printable {

    private Performable performable;

    protected Skill(Performable performable) {
        this.performable = performable;

    }

    @Override
    public void performAction() {
        performable.performAction();
    }
}

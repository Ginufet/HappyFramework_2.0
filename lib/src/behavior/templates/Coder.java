package behavior.templates;

import behavior.Performable;
import behavior.Skill;

public class Coder extends Skill {
    public Coder(Performable performable) {
        super(performable);
    }

    @Override
    public void performAction() {
        super.performAction();
        print("Coding.");
    }
}

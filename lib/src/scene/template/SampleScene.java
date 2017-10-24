package scene.template;

import entity.animal.template.Dog;

public class SampleScene extends Scene {
    public SampleScene() {
        super();
    }

    public SampleScene(String string) {
        super(string);
    }



    @Override
    public void action() {
        // TODO: Create entity using factory method or abstract factory method
        Dog doggy = new Dog();
        doggy.run();
        doggy.call();
    }
}

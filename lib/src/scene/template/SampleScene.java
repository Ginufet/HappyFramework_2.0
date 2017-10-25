package scene.template;

import allocator.Allocator;
import allocator.Strategy;
import behavior.Transform;
import entity.animal.template.Dog;
import entity.plant.template.AppleTree;
import scene.Scene;

public class SampleScene extends Scene {
    public SampleScene() {
        super();
    }

    @Override
    public void action() {
        // Write your code here.
        // TODO: Create entity using factory method or abstract factory method
        Dog doggy = new Dog();
        Transform<Dog, Dog> dogDogTransform = new Transform<>(doggy);
        System.out.println(dogDogTransform.getSource().getClass());
        dogDogTransform.transform();
        System.out.println(dogDogTransform.getTarget());


//        Allocator<Dog> dogAllocator = new Allocator<>();
//        dogAllocator.setObtainArguments(Strategy.PURCHASE);
//        Dog doggy = dogAllocator.obtain();
//        dogAllocator.setMother(doggy);
//        dogAllocator.setObtainArguments(Strategy.REPRODUCE);
//        Dog doggyChild = dogAllocator.obtain();
//
//        System.out.println(doggyChild.getClass());

    }
}

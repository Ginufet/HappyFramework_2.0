package scene.template;

import allocator.Allocator;
import allocator.Strategy;
import application.Timer;
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

//        // Timer test
//        Timer timer = Timer.getInstance();
//        long deltaTime = timer.getDeltaTime();
//        System.out.println(deltaTime);

//        // Allocator test
//        Allocator<Dog> dogAllocator = new Allocator<>();
//        dogAllocator.setObtainArguments(Strategy.PURCHASE);
//        Dog doggy = dogAllocator.obtain();
//        dogAllocator.setMother(doggy);
//        dogAllocator.setObtainArguments(Strategy.REPRODUCE);
//        Dog doggyChild = dogAllocator.obtain();
//
//        System.out.println(doggyChild.getClass());


        // TODO: Create entity using factory method or abstract factory method


//        // Transform test
//        Dog doggy = new Dog();
//        Transform<Dog, Dog> dogDogTransform = new Transform<>(doggy);
//        dogDogTransform.transform();
//        System.out.println(dogDogTransform.getTarget());


    }
}

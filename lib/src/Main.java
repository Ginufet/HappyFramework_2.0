import allocator.Allocator;
import allocator.Strategy;
import application.SampleApplication;

import behavior.Performable;
import behavior.templates.Coder;
import behavior.templates.Dancer;
import behavior.templates.Singer;
import entity.animal.template.Dog;
import entity.human.Human;


public class Main {
    public static void main(String[] args) {
        SampleApplication application = new SampleApplication();
        application.start();
        application.end();

//        Performable[] array = {new Singer(new Human()), new Dancer(new Singer(new Human())),
//                new Coder(new Dancer(new Singer(new Human())))};
//        for (Performable anArray : array) {
//            anArray.performAction();
//        }

        Allocator<Dog> dogAllocator = new Allocator<>();
        dogAllocator.setObtainArguments(Strategy.PURCHASE);
        Dog doggy = dogAllocator.obtain();
        dogAllocator.setObtainArguments(Strategy.REPRODUCE);
        doggy = dogAllocator.obtain();
    }

}

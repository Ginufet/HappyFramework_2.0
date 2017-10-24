package entity.animal.template;

public class Dog extends Animal{
    @Override
    public void call() {
        print("Wang! Wang! Wang!");
    }

    @Override
    public void run() {
        print("Very fast.");
    }
}

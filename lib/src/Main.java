import allocator.Allocator;
import allocator.Strategy;
import application.SampleApplication;

import entity.animal.template.Dog;

public class Main {
    public static void main(String[] args) {
        SampleApplication application = new SampleApplication();
        application.start();
        application.end();
    }
}

package application;

public abstract class Application implements Printable {
    Application(){
        print("Constructing application and initializing resources....");
    }

    public abstract void start();

    public abstract void end();

}



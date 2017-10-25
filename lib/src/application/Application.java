package application;

public abstract class Application implements Printable {

    protected Director director = null;

    Application(){
        print("Constructing application and initializing resources....");
        director = Director.getInstance();
    }

    public abstract void start();

    public abstract void end();

}



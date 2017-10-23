package application;

public  class Application implements Printable{
    public Application(){
        print("Constructing application and initializing resources....");
    }

    public void start(){
        print("Story starts!");
    }

    public void end(){
        print("Release resources. Story ends.");
    }


}



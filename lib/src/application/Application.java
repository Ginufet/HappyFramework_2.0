package application;

abstract class Application implements Printable, Startable{
    Application(){
        print("Constructing application and initializing resources....");
    }

//    public void start(){
//        print("Story starts!");
//    }

    public void end(){
        print("Release resources. Story ends.");
    }
}



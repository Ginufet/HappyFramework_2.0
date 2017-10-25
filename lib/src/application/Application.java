package application;

import scene.Scene;

import java.util.ArrayList;
import java.util.List;

public abstract class Application implements Printable {

    protected Director director = null;
    protected List<Scene> scenes = null;

    Application(){
        print("Constructing application and initializing resources....");
        director = Director.getInstance();
        scenes = new ArrayList<>();
    }

    public void initialize() {
        for (int i = 0; i < scenes.size(); ++i) {
            scenes.get(i).init();
        }
    }

    public abstract void start();

    public abstract void end();

    public void addScene(Scene scene) {
        scenes.add(scene);
    }

}



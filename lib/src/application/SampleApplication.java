package application;


import scene.template.SampleScene;

public class SampleApplication extends Application {
    @Override
    public void start() {
        print("Story start");
        SampleScene sampleScene = new SampleScene();
        sampleScene.action();
    }
}

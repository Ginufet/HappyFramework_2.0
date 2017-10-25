package application;
import scene.template.SampleScene;


public class SampleApplication extends Application {
    @Override
    public void start() {
        print("Story Starts");
        SampleScene sampleScene = new SampleScene();
        sampleScene.action();
    }

    @Override
    public void end() {
        print("Story Ends");
    }
}

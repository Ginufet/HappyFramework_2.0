package scene;

import application.Printable;
import entity.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;

public class Scene implements Printable, Actionable{

    private String sceneName;
    private HashMap<String, Entity> children;
    private static long id = 0;



    public Scene(){
        sceneName = "Default";
    }

    public Scene(String name){
        sceneName = name;

    }

    @Override
    public void action() {
        print("Scene " + sceneName +" Started");
    }

    public String addChild(Entity entity) {
        String key = entity.getClass().toString() + " " +id++;
        children.put("" + key, entity);
        return key;
    }

    public Entity removeChild(String key) {
        return children.remove(key);
    }

    public Collection<Entity> getAllChildren() {
        return children.values();
    }
    public void clearChildren() {
        children.clear();
    }

}

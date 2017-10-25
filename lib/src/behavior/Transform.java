package behavior;

import application.Printable;


public class Transform<T, S> implements Transformable<S>, Printable {

    private T rootEntity;
    private S currentEntity;

    public Transform(T entity) {
        this.rootEntity = entity;
    }

    @Override
    public String getCurrentEntity() {
        String typeName = getTruncatedName(rootEntity.getClass().getSimpleName());
        if (this.currentEntity != null){
             typeName = getTruncatedName(currentEntity.getClass().toString());
             print("I'm " + typeName + " now!");
             return currentEntity.getClass().toString();
        }
        print("I'm still" + typeName + " .");
        return rootEntity.getClass().getSimpleName();
    }

    @Override
    public boolean transform(S newEntity) {
        this.currentEntity = newEntity;
        return  (this.currentEntity != null);
    }

    @Override
    public String getPreviousEntity() {
        String typeName = getTruncatedName(rootEntity.getClass().getSimpleName());
        print("I was " + typeName + " before.");
        return rootEntity.getClass().getSimpleName();
    }

    private static String getTruncatedName(String fullClassName) {
        String[] splited = fullClassName.split("\\.");
        return splited[splited.length - 1];
    }

}
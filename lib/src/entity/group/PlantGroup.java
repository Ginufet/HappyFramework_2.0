package entity.group;

import behavior.plant.PlantBehavior;
import entity.plant.Plant;
import entity.plant.PlantProduct;

class PlantGroup<T extends Plant> extends Group<T> implements PlantBehavior {
    public PlantGroup(T t, int number) {
        super(t, number);
    }

    @Override
    public void grow() {
        print("" + count + " bodies grew together: see next line");
        entity.grow();
    }

    @Override
    public Group<PlantProduct> yield(int count) {
        print("" + this.count + " products were produced: see next line");
        return entity.yield(count * this.count);
    }
}
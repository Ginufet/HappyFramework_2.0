package behavior.plant;

import entity.group.Group;
import entity.plant.PlantProduct;

public interface Yielding {
    //Yielding fruits... etc.
    Group<PlantProduct> yield(int count);
}

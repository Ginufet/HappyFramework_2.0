package allocator;

import application.Printable;
import entity.Entity;

interface Obtainable {
    Entity obtain();
}

public class Allocator<T extends Entity> implements Obtainable, Printable {

    private Obtainable proxy = new PurchaseProxy<T>();
    private T mother = null;

    @SuppressWarnings(value = {"unchecked"})
    public T obtain() {
        return (T)proxy.obtain();
    }

    public void setMother(T mother) {
        this.mother = mother;
    }

    public void setObtainArguments(Strategy strategy) {
        switch (strategy) {
            case PURCHASE:
                this.proxy = new PurchaseProxy<T>();
                break;
            case REPRODUCE:
                this.proxy = new ReproduceProxy<>(mother);
                break;
            default:
                print("No such strategy.");
        }
    }
}

class PurchaseProxy<T extends Entity> implements Obtainable, Printable {
    PurchaseProxy() {
    }

    public T obtain() {
        print("Buying Something");
        //TODO To add Factory Method and Abstract Method etc.
        return null;
    }
}

class ReproduceProxy<T extends Entity> implements Obtainable, Printable {

    private T mother = null;

    ReproduceProxy(T mother) {
        this.mother = mother;
    }


    @SuppressWarnings(value = {"unchecked"})
    public T obtain() {
        if (this.mother == null) {
            print("No available mother. Nothing was born.");
            return null;
        }
        print("A child was born!");
        return (T) mother.clone();
    }
}

package allocator;

import application.Printable;
import entity.Entity;



interface Obtainable {
    Entity obtain();
}


public class Allocator<T extends Entity> implements Obtainable {


    private Strategy strategy = Strategy.PURCHASE;
    private T mother = null;

    public T obtain() {
        T result = null;
        if (strategy == Strategy.PURCHASE) {
            PurchaseProxy<T> purchaseProxy = new PurchaseProxy<>();
            result = purchaseProxy.obtain();
        } else if (strategy == Strategy.REPRODUCE) {
            ReproduceProxy<T> reproduceProxy = new ReproduceProxy<>(mother);
            result = reproduceProxy.obtain();
        }
        return result;
    }

    public void setObtainArguments(Strategy strategy, T mother) {
        this.strategy = strategy;
        this.mother = mother;
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

    private T mother;

    ReproduceProxy(T mother) {
        this.mother = mother;
    }


    @SuppressWarnings(value = {"unchecked"})
    public T obtain() {
        print("A child was born!");
        return (T) mother.clone();
    }
}

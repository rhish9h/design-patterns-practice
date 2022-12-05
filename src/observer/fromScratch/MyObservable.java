package observer.fromScratch;

import java.util.ArrayList;
import java.util.List;

public abstract class MyObservable {
    List<MyObserver> observers = new ArrayList<>();
    boolean changed = false;

    public void addObserver(MyObserver observer) {
        observers.add(observer);
    }

    public void setChanged() {
        changed = true;
    }

    public void clearChanged() {
        changed = false;
    }

    public void notifyObservers() {
        if (!changed) {
            return;
        }
        for (MyObserver observer : observers) {
            observer.update(this, new Object());
        }
        clearChanged();
    }
}

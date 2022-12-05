package observer.javaImpl;

import java.util.Observable;

public class Teacher extends Observable {
    String teaching;
    public void teach() {
        teaching = String.valueOf(Math.random() * 15);
        System.out.println("Teaching done at Teacher: " + teaching);
        setChanged();
        notifyObservers();
    }

    public String getTeaching() {
        return teaching;
    }
}

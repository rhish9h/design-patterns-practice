package observer.javaImpl;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {
    @Override
    public void update(Observable obj, Object o) {
        Teacher teacher = (Teacher) obj;
        System.out.println("Got teaching at Student: " + teacher.getTeaching());
    }
}

package observer.fromScratch;

import java.util.Observable;

public class Student implements MyObserver {
    @Override
    public void update(MyObservable obj, Object o) {
        Teacher teacher = (Teacher) obj;
        System.out.println("Got teaching at Student: " + teacher.getTeaching());
    }
}

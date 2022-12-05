package decorator;

public class BasicComponent implements Component {
    @Override
    public void doSomething() {
        System.out.println("Doing something basically");
    }
}

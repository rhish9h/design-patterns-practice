package decorator;

public class DecoratedComponentA extends Decorator {
    @Override
    public void doSomething() {
        super.component.doSomething();
        System.out.println("A Added functionality - do something");
    }
}

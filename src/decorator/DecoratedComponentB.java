package decorator;

public class DecoratedComponentB extends Decorator {
    @Override
    public void doSomething() {
        super.component.doSomething();
        System.out.println("B Added functionality - do something");
    }
}

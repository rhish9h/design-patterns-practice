package decorator;

public class Main {
    public static void main(String[] args) {
        BasicComponent basicComponent = new BasicComponent();

        DecoratedComponentA decoratedComponentA = new DecoratedComponentA();
        decoratedComponentA.setComponent(basicComponent);
        decoratedComponentA.doSomething();
        System.out.println();

        DecoratedComponentB decoratedComponentB = new DecoratedComponentB();
        decoratedComponentB.setComponent(basicComponent);
        decoratedComponentB.doSomething();
        System.out.println();

        DecoratedComponentB both = new DecoratedComponentB();
        both.setComponent(decoratedComponentA);
        both.doSomething();
        System.out.println();
    }
}

package bridge;

public class Subaru implements Car {
    private Engine engine;

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Display subaru logo");
    }
}

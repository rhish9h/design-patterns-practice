package bridge;

public class Nissan implements Car {
    private Engine engine;

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Display Nissan logo");
    }
}

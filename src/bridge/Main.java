package bridge;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Nissan();
        Car subaru = new Subaru();
        Engine v6 = new V6Engine();
        Engine v8 = new V8Engine();

        nissan.setEngine(v6);
        nissan.startEngine();

        subaru.setEngine(v6);
        subaru.startEngine();

        nissan.setEngine(v8);
        nissan.startEngine();

        nissan.setEngine(v8);
        nissan.startEngine();
    }
}

package chainOfResponsibility;

public class TailHandler implements Handler {
    @Override
    public void handleRequest(int value) {
        System.out.println("Reached the tail: " + value);
    }
}

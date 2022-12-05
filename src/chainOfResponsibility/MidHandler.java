package chainOfResponsibility;

public class MidHandler implements Handler {
    private Handler successor;

    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    @Override
    public void handleRequest(int value) {
        if (value < 5) {
            System.out.println("Handled in mid handler: " + value);
        } else if (successor != null) {
            successor.handleRequest(value);
        }
    }
}

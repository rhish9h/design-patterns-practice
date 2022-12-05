package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        MidHandler midHandler = new MidHandler();
        TailHandler tailHandler = new TailHandler();
        midHandler.setSuccessor(tailHandler);

        for (int i = 0; i < 10; i += 3) {
            midHandler.handleRequest(i);
        }
    }
}

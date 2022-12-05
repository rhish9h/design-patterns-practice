package strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new StrategyA());
        context.useStrategy();

        context.setStrategy(new StrategyB());
        context.useStrategy();
    }
}

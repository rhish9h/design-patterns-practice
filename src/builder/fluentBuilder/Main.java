package builder.fluentBuilder;

public class Main {
    public static void main(String[] args) {
        MyFluentBuilder builder = new MyFluentBuilder();
        Director director = new Director();
        director.constructBasicProduct(builder);
        System.out.println(builder.getProduct());
    }
}

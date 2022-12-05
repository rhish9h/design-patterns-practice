package builder.fluentBuilder;

public class Director {
    public void constructBasicProduct(FluentBuilder builder) {
        builder.setColor("blue").setSize("10");
    }
}

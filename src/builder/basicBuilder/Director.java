package builder.basicBuilder;

import builder.Product;

public class Director {
    public void constructBasicProduct(BasicBuilder builder) {
        builder.setColor("blue");
        builder.setSize("10");
    }
}

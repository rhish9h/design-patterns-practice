package builder.fluentBuilder;

import builder.Product;

public class MyFluentBuilder implements FluentBuilder {
    private String color;
    private int size;

    @Override
    public FluentBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public FluentBuilder setSize(String size) {
        this.size = Integer.valueOf(size);
        return this;
    }

    public Product getProduct() {
        return new Product(color, size);
    }
}

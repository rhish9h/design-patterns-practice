package builder.basicBuilder;

import builder.Product;

public class MyBasicBuilder implements BasicBuilder {
    private String color;
    private int size;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setSize(String size) {
        this.size = Integer.valueOf(size);
    }

    public Product getProduct() {
        return new Product(color, size);
    }
}

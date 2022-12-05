package builder;

public class Product {
    private String color;
    private int size;

    public Product(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}

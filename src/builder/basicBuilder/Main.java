package builder.basicBuilder;

public class Main {
    public static void main(String[] args) {
        MyBasicBuilder builder = new MyBasicBuilder();
        Director director = new Director();
        director.constructBasicProduct(builder);
        System.out.println(builder.getProduct());
    }
}

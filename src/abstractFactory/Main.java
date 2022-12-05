package abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        AbstractFactory roundedShapeFactory = new RoundedShapeFactory();

        rectangle = roundedShapeFactory.getShape("rectangle");
        rectangle.draw();

        square = roundedShapeFactory.getShape("square");
        square.draw();
    }
}

package abstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("square")) {
            return new RoundedSquare();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new RoundedRectangle();
        }
        return null;
    }
}

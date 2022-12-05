package adapter;

public class Main {
    public static void main(String[] args) {
        Shape rectangleAdapter = new RectangleAdapter(new Rectangle());
        int x1 = 10;
        int x2 = 20;
        int y1 = 30;
        int y2 = 40;
        rectangleAdapter.draw(x1, x2, y1, y2);
    }
}

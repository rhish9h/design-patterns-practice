package composite;

public class Leaf implements Component {
    @Override
    public void displayName() {
        System.out.println("Leaf " + this.hashCode());
    }
}

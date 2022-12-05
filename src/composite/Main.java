package composite;

public class Main {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Composite root = new Composite();
        root.addChild(leaf);
        Composite branch = new Composite();
        branch.addChild(leaf1);
        branch.addChild(leaf2);
        root.addChild(branch);
        root.displayName();
    }
}

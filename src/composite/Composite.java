package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    List<Component> children = new ArrayList<>();

    public void addChild(Component component) {
        children.add(component);
    }

    @Override
    public void displayName() {
        for (Component component : children) {
            component.displayName();
        }
    }
}

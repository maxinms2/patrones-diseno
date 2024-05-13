package patrones.composite.patron;

import java.util.ArrayList;
import java.util.List;

class Directory implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void display() {
        System.out.println("Carpeta: " + name);
        for (Component child : children) {
            child.display();
        }
    }
}

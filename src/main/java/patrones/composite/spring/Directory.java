package patrones.composite.spring;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class Directory implements Componente {
    private String name;
    private List<Componente> children = new ArrayList<>();

    // Constructor para inyección de dependencia
    public Directory(String name) {
        this.name = name;
    }

    public void add(Componente component) {
        children.add(component);
    }

    @Override
    public void display() {
        System.out.println("Carpeta: " + name);
        for (Componente child : children) {
            child.display();
        }
    }
}


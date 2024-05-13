package patrones.composite.funcional;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import patrones.composite.spring.Componente;

public class Directory implements Componente {
    private final String name;
    private final List<Componente> children;

    public Directory(String name, List<Componente> children) {
        this.name = name;
        this.children = Collections.unmodifiableList(children);
    }

    public void display() {
        System.out.println("Carpeta: " + name);
        children.forEach(Componente::display);
    }

    public String getName() {
        return name;
    }

    public List<Componente> getChildren() {
        return children;
    }
}

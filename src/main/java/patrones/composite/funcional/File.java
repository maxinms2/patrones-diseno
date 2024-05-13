package patrones.composite.funcional;

import patrones.composite.spring.Componente;

public class File implements Componente {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Archivo: " + name);
    }

    public String getName() {
        return name;
    }
}

package patrones.composite.spring;

import org.springframework.stereotype.Component;

@Component
public class File implements Componente {
    private String name;

    // Constructor para inyección de dependencia
    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Archivo: " + name);
    }
}


package patrones.composite.funcional;

import patrones.composite.spring.Componente;

public class Cliente {

    public static void main(String[] args) {
        Componente root = FileSystemSetup.createFileSystem();
        root.display();
    }
}

package patrones.composite.funcional;

import java.util.Arrays;

import patrones.composite.spring.Componente;

public class FileSystemSetup {

    public static Componente createFileSystem() {
        File file1 = new File("Archivo1.txt");
        File file2 = new File("Archivo2.txt");

        Directory subDirectory = new Directory("Carpeta1", Arrays.asList(file2));
        Directory root = new Directory("Root", Arrays.asList(file1, subDirectory));

        return root;
    }
}

package patrones.adapter.sinpatron;

public class FileReader {
    public void readFile(String filename) {
        if (filename.endsWith(".txt")) {
            // código para leer un archivo de texto
        } else if (filename.endsWith(".csv")) {
            // código para leer un archivo csv
        } else if (filename.endsWith(".json")) {
            // código para leer un archivo json
        } else {
            System.out.println("Formato de archivo no compatible");
        }
    }
}
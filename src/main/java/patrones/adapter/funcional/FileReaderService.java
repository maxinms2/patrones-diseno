package patrones.adapter.funcional;

import java.util.Map;

public class FileReaderService {
    private final Map<String, FileReader> readers = Map.of(
        ".txt", filename -> System.out.println("Leyendo archivo TXT: " + filename),
        ".csv", filename -> System.out.println("Leyendo archivo CSV: " + filename),
        ".json", filename -> System.out.println("Leyendo archivo JSON: " + filename)
    );
    
    public void readFile(String filename) {
        String fileExtension = filename.substring(filename.lastIndexOf("."));
        FileReader reader = readers.getOrDefault(fileExtension, 
            f -> System.out.println("Formato de archivo no soportado: " + f));
        reader.readFile(filename);
    }
}
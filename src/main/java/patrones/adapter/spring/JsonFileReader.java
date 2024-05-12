package patrones.adapter.spring;

import org.springframework.stereotype.Service;

@Service
public class JsonFileReader implements FileReader {
    @Override
    public void readFile(String filename) {
        // Implementación específica para leer archivos JSON
        System.out.println("Leyendo archivo JSON: " + filename);
    }
}
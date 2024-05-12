package patrones.adapter.spring;

import org.springframework.stereotype.Service;

@Service
public class TxtFileReader implements FileReader {
    @Override
    public void readFile(String filename) {
        // Implementación específica para leer archivos TXT
        System.out.println("Leyendo archivo TXT: " + filename);
    }
}

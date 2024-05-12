package patrones.adapter.spring;

import org.springframework.stereotype.Service;

@Service
public class CsvFileReader implements FileReader {
    @Override
    public void readFile(String filename) {
        // Implementación específica para leer archivos CSV
        System.out.println("Leyendo archivo CSV: " + filename);
    }
}

package patrones.adapter.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileReaderAdapter {
    private List<FileReader> readers;

    @Autowired
    public FileReaderAdapter(List<FileReader> readers) {
        this.readers = readers;
    }

    public void readFile(String filename) {
        FileReader reader = readers.stream()
            .filter(r -> filename.endsWith(getFileExtension(r)))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Formato de archivo no soportado"));
        reader.readFile(filename);
    }

    private String getFileExtension(FileReader reader) {
        if (reader instanceof TxtFileReader) return ".txt";
        if (reader instanceof CsvFileReader) return ".csv";
        if (reader instanceof JsonFileReader) return ".json";
        return "";
    }
}
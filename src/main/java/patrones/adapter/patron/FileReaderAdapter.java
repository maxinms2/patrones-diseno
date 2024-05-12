package patrones.adapter.patron;

public class FileReaderAdapter {
    public void readFile(String filename) {
        FileReader reader;
        if (filename.endsWith(".txt")) {
            reader = new TxtFileReader();
        } else if (filename.endsWith(".csv")) {
            reader = new CsvFileReader();
        } else if (filename.endsWith(".json")) {
            reader = new JsonFileReader();
        } else {
            System.out.println("Formato de archivo no compatible");
            return;
        }
        reader.readFile(filename);
    }
}
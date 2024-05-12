package patrones.adapter.funcional;

public class Cliente {
    public static void main(String[] args) {
        FileReaderService fileReaderService = new FileReaderService();
        fileReaderService.readFile("example.txt");
        fileReaderService.readFile("data.csv");
        fileReaderService.readFile("config.json");
        fileReaderService.readFile("image.png");
    }
}

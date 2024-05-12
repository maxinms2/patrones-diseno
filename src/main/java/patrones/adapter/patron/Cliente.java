package patrones.adapter.patron;

public class Cliente {
    public static void main(String[] args) {
        FileReaderAdapter adapter = new FileReaderAdapter();
        adapter.readFile("data.txt");
    }
}

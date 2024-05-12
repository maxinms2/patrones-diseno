package patrones.adapter.sinpatron;

public class Cliente {
    public static void main(String[] args) {
        FileReader reader = new FileReader();
        reader.readFile("data.txt");
    }
}

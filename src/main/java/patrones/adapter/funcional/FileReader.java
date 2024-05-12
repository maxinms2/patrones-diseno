package patrones.adapter.funcional;

@FunctionalInterface
public interface FileReader {
    void readFile(String filename);
}
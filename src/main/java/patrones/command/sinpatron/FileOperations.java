package patrones.command.sinpatron;

public class FileOperations {
    public static void main(String[] args) {
        String command = "open";
        if ("open".equals(command)) {
            System.out.println("Archivo abierto.");
        } else if ("save".equals(command)) {
            System.out.println("Archivo guardado.");
        }
    }
}

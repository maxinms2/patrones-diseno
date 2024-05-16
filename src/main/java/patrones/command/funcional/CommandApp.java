package patrones.command.funcional;

import java.util.Map;
import java.util.function.Consumer;

public class CommandApp {

    private static final Map<String, Runnable> commands = Map.of(
        "open", () -> System.out.println("Archivo abierto."),
        "save", () -> System.out.println("Archivo guardado.")
    );

    public static void executeCommand(String commandName) {
        Runnable command = commands.getOrDefault(commandName, () -> System.out.println("Comando no reconocido."));
        command.run();
    }

    public static void main(String[] args) {
        executeCommand("open"); // Test the command execution
        executeCommand("save");
        executeCommand("edit"); // This should output "Comando no reconocido."
    }
}


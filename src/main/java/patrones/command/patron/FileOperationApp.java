package patrones.command.patron;

//Paso 1: Interfaz Command
interface Command {
 void execute();
}

//Paso 2: Comandos Concretos
class OpenFileCommand implements Command {
 public void execute() {
     System.out.println("Archivo abierto.");
 }
}

class SaveFileCommand implements Command {
 public void execute() {
     System.out.println("Archivo guardado.");
 }
}

//Paso 3: Cliente e Invocador
public class FileOperationApp {
 public static void main(String[] args) {
	 args=new String[2];
	 args[0]="open";
     Command openCommand = new OpenFileCommand();
     Command saveCommand = new SaveFileCommand();

     if ("open".equals(args[0])) {
         openCommand.execute();
     } else if ("save".equals(args[0])) {
         saveCommand.execute();
     }
 }
}

package patrones.composite.sinpatron;

public class FileSystem {
	public static void main(String[] args) {
		// Información sobre el sistema de archivos
		String[] entries = { "Archivo1.txt", "Carpeta1", "Archivo2.txt", "Carpeta2" };
		String[] entryTypes = { "archivo", "carpeta", "archivo", "carpeta" };

		// Mostrar las entradas del sistema de archivos
		for (int i = 0; i < entries.length; i++) {
			if (entryTypes[i].equals("archivo")) {
				System.out.println("Archivo: " + entries[i]);
			} else {
				System.out.println("Carpeta: " + entries[i]);
			}
		}
	}
}

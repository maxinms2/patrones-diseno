package patrones.composite.patron;

public class Cliente {
	public static void main(String[] args) {
		Directory root = new Directory("Root");
		root.add(new File("Archivo1.txt"));
		Directory subDir = new Directory("Carpeta1");
		subDir.add(new File("Archivo2.txt"));
		root.add(subDir);

		root.display();
	}
}

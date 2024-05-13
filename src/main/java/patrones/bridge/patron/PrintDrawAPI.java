package patrones.bridge.patron;

//ConcreteImplementor B
class PrintDrawAPI implements DrawAPI {
	public void drawCircle() {
		System.out.println("Imprime un círculo en papel.");
	}

	public void drawSquare() {
		System.out.println("Imprime un cuadrado en papel.");
	}
}
package patrones.bridge.patron;

//ConcreteImplementor A
class ScreenDrawAPI implements DrawAPI {
	public void drawCircle() {
		System.out.println("Dibuja un círculo en la pantalla.");
	}

	public void drawSquare() {
		System.out.println("Dibuja un cuadrado en la pantalla.");
	}
}
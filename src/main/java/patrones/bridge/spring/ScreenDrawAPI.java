package patrones.bridge.spring;

import org.springframework.stereotype.Component;

//ConcreteImplementor A
@Component
class ScreenDrawAPI implements DrawAPI {
	public void drawCircle() {
		System.out.println("Dibuja un círculo en la pantalla.");
	}

	public void drawSquare() {
		System.out.println("Dibuja un cuadrado en la pantalla.");
	}
}
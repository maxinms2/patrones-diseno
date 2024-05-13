package patrones.bridge.spring;

import org.springframework.stereotype.Component;

//ConcreteImplementor B
@Component
class PrintDrawAPI implements DrawAPI {
	public void drawCircle() {
		System.out.println("Imprime un círculo en papel.");
	}

	public void drawSquare() {
		System.out.println("Imprime un cuadrado en papel.");
	}
}
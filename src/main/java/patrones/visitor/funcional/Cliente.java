package patrones.visitor.funcional;

public class Cliente {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape square = new Square(10);

		circle.performOperation(Operations.calculateCircleArea);
		square.performOperation(Operations.calculateSquareArea);
	}
}

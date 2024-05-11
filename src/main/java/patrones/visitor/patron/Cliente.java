package patrones.visitor.patron;

public class Cliente {
	public static void main(String[] args) {
		Figure circle = new Circle(5);
		Figure square = new Square(10);

		AreaPerimeterVisitor visitor = new AreaPerimeterVisitor();

		circle.accept(visitor);
		square.accept(visitor);
	}
}

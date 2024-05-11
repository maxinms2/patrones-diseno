package patrones.visitor.funcional;

public class Operations {
    public static final ShapeOperation calculateCircleArea = (shape) -> {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            double area = Math.PI * circle.getRadius() * circle.getRadius();
            System.out.println("Área del círculo: " + area);
        }
    };

    public static final ShapeOperation calculateSquareArea = (shape) -> {
        if (shape instanceof Square) {
            Square square = (Square) shape;
            double area = square.getSide() * square.getSide();
            System.out.println("Área del cuadrado: " + area);
        }
    };
}
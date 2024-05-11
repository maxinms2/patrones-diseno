package patrones.visitor.patron;

class AreaPerimeterVisitor implements FigureVisitor {
    public void visitCircle(Circle circle) {
        double area = Math.PI * circle.radius * circle.radius;
        double perimeter = 2 * Math.PI * circle.radius;
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimeter);
    }

    public void visitSquare(Square square) {
        double area = square.side * square.side;
        double perimeter = 4 * square.side;
        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimeter);
    }
}

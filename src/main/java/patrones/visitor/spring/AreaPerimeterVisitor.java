package patrones.visitor.spring;

import org.springframework.stereotype.Component;

@Component
public class AreaPerimeterVisitor implements FigureVisitor {
    @Override
    public void visitCircle(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimeter);
    }

    @Override
    public void visitSquare(Square square) {
        double area = square.getSide() * square.getSide();
        double perimeter = 4 * square.getSide();
        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimeter);
    }
}

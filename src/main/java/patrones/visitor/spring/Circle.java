package patrones.visitor.spring;

import org.springframework.stereotype.Component;


@Component
public class Circle implements Figure {
    private final double radius = 5;  // Simplificación para el ejemplo

    @Override
    public void accept(FigureVisitor visitor) {
        visitor.visitCircle(this);
    }

    public double getRadius() {
        return radius;
    }
}
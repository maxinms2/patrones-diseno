package patrones.visitor.spring;

import org.springframework.stereotype.Component;

@Component
public class Square implements Figure {
    private final double side = 10;  // Simplificación para el ejemplo

    @Override
    public void accept(FigureVisitor visitor) {
        visitor.visitSquare(this);
    }

    public double getSide() {
        return side;
    }
}
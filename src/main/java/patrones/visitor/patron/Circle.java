package patrones.visitor.patron;

public class Circle implements Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void accept(FigureVisitor visitor) {
        visitor.visitCircle(this);
    }
}
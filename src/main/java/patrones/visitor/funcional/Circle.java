package patrones.visitor.funcional;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void performOperation(ShapeOperation operation) {
        operation.accept(this);
    }
}
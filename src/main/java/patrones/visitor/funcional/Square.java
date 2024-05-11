package patrones.visitor.funcional;

public class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void performOperation(ShapeOperation operation) {
        operation.accept(this);
    }
}
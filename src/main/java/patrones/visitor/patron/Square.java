package patrones.visitor.patron;

public class Square implements Figure {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public void accept(FigureVisitor visitor) {
        visitor.visitSquare(this);
    }
}
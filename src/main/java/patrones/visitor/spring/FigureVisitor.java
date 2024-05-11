package patrones.visitor.spring;

public interface FigureVisitor {
    void visitCircle(Circle circle);
    void visitSquare(Square square);
}

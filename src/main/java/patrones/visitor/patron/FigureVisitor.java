package patrones.visitor.patron;

interface FigureVisitor {
    void visitCircle(Circle circle);
    void visitSquare(Square square);
}

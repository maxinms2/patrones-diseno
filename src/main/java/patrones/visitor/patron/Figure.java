package patrones.visitor.patron;

interface Figure {
	void accept(FigureVisitor visitor);
}
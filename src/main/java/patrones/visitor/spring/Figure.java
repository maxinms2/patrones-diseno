package patrones.visitor.spring;

public interface Figure {
	void accept(FigureVisitor visitor);
}
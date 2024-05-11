package patrones.visitor.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ClienteVisitor {
    private List<Figure> figures;
    private FigureVisitor visitor;

    @Autowired
    public ClienteVisitor(List<Figure> figures, FigureVisitor visitor) {
        this.figures = figures;
        this.visitor = visitor;
    }

    public String calculateAreasAndPerimeters() {
        StringBuilder sb = new StringBuilder("Results:\n");
        figures.forEach(figure -> figure.accept(visitor));
        return sb.toString();
    }
}

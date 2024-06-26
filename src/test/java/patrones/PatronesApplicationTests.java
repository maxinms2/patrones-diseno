package patrones;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import patrones.adapter.spring.FileReaderAdapter;
import patrones.bridge.spring.Shape;
import patrones.visitor.spring.Circle;
import patrones.visitor.spring.ClienteVisitor;
import patrones.visitor.spring.Figure;
import patrones.visitor.spring.FigureVisitor;
import patrones.visitor.spring.Square;

@SpringBootTest
class PatronesApplicationTests {
	@Autowired
	private FigureVisitor visitor;
	
	@Autowired
	private FileReaderAdapter adapter;
	
	@Autowired
	private ApplicationContext context;
	
	@Test
	void visitor() {
		Circle c= new Circle(); Square sq=new Square();
	    List<Figure> figures=new ArrayList<>();
	    figures.add(c); figures.add(sq);
		ClienteVisitor cliente=new ClienteVisitor(figures, visitor);
		
        StringBuilder sb = new StringBuilder("Results:\n");
        figures.forEach(figure -> figure.accept(visitor));
         sb.toString();
	}
	
	@Test
	void Adapter() {
		String filename="data.csv";
        adapter.readFile(filename);
        System.out.println( "Archivo procesado correctamente: " + filename);
	}
	
	@Autowired
	private Shape shape;
	@Qualifier("Circle")
	@Test
	void bridge() {
	
			shape.draw();
	}
	

}

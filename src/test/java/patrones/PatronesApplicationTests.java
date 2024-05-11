package patrones;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import patrones.visitor.spring.Circle;
import patrones.visitor.spring.ClienteVisitor;
import patrones.visitor.spring.Figure;
import patrones.visitor.spring.FigureVisitor;
import patrones.visitor.spring.Square;

@SpringBootTest
class PatronesApplicationTests {
	@Autowired
	private FigureVisitor visitor;
	
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
	

}

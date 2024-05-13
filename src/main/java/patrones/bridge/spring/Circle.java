package patrones.bridge.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Circle extends Shape {
	@Autowired
	public Circle(DrawAPI drawAPI) {
		super(drawAPI);
	}

	public void draw() {
		drawAPI.drawCircle();
	}
}

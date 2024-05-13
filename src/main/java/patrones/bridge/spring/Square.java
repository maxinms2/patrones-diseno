package patrones.bridge.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Square extends Shape {
    @Autowired
    public Square(DrawAPI drawAPI) {
        super(drawAPI);
    }

    public void draw() {
        drawAPI.drawSquare();
    }
}
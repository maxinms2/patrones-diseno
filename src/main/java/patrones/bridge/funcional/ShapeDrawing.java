package patrones.bridge.funcional;

import java.util.function.Consumer;

public class ShapeDrawing {
    public static void drawShape(Consumer<Void> drawFunction) {
        drawFunction.accept(null);
    }
}


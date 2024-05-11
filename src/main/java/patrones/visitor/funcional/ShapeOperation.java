package patrones.visitor.funcional;

import java.util.function.Consumer;

@FunctionalInterface
public interface ShapeOperation extends Consumer<Shape> {
}

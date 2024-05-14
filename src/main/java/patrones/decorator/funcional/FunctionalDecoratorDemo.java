package patrones.decorator.funcional;

import java.util.function.Function;

public class FunctionalDecoratorDemo {
    
    // Función para aplicar la decoración de mayúsculas
    static Function<String, String> upperCaseDecorator = text -> text.toUpperCase();

    // Función para aplicar la decoración de exclamación
    static Function<String, String> exclamationDecorator = text -> text + "!!!";

    // Función para aplicar la decoración de estrellas
    static Function<String, String> starDecorator = text -> "***" + text + "***";

    public static void main(String[] args) {
        Function<String, String> decoratedText = upperCaseDecorator
                .andThen(exclamationDecorator)
                .andThen(starDecorator);

        String text = "Hello, World!";
        System.out.println(decoratedText.apply(text));
    }
}

package patrones.chain.funcional;

import java.util.function.Consumer;
import java.util.function.Function;

public class Cliente {
	 public static void main(String[] args) {
//	        Handler chain = Handlers.textHandler;
//	        chain = chain.andThen(Handlers.imageHandler);
//	        chain = chain.andThen(Handlers.audioHandler);
//
//	        chain.handleRequest("Texto", "Hola, esto es un texto de ejemplo");
//	        chain.handleRequest("Imagen", "imagen.jpg");
//	        chain.handleRequest("Audio", "audio.mp3");
	        
//	        Function<String, String> toUpperCaseFunction = String::toUpperCase;
//
//	        // Función que agrega un sufijo a una cadena
//	        Function<String, String> addSuffixFunction = s -> s + "_suffix";
//
//	        // Aplicamos las funciones en secuencia
//	        Function<String, String> composedFunction = toUpperCaseFunction.andThen(addSuffixFunction);
//
//	        // Aplicamos la función compuesta
//	        String result = composedFunction.apply("hello"); // Primero convierte a mayúsculas ("HELLO"), luego agrega el sufijo ("HELLO_suffix")
//
//	        System.out.println("Resultado: " + result);
		 
		 
		 
	        // Consumer que imprime una cadena en mayúsculas
	        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

	        // Consumer que agrega un sufijo a una cadena y la imprime
	        Consumer<String> printWithSuffix = str -> System.out.println(str + "_suffix");

	        // Combinamos los consumidores en una cadena de operaciones
	        Consumer<String> combinedConsumer = printUpperCase.andThen(printWithSuffix);

	        // Aplicamos la cadena de operaciones a una cadena de ejemplo
	        combinedConsumer.accept("hello"); // Primero imprime "HELLO", luego imprime "hello_suffix"
	    }
}

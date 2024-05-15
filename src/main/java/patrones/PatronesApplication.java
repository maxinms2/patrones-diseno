package patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import patrones.chain.spring.Handler;

@SpringBootApplication
public class PatronesApplication {
	private final Handler handlerChain;

	public PatronesApplication(Handler handlerChain) {
		this.handlerChain = handlerChain;
	}

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		handlerChain.handleRequest("Texto", "Hola, esto es un texto de ejemplo");
//		handlerChain.handleRequest("Imagen", "imagen.jpg");
//		handlerChain.handleRequest("Audio", "audio.mp3");
//	}
}

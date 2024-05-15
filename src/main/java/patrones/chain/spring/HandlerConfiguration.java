package patrones.chain.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandlerConfiguration {

    @Autowired
    private TextHandler textHandler;

    @Autowired
    private ImageHandler imageHandler;

    @Autowired
    private AudioHandler audioHandler;

    @Bean
    public Handler handlerChain() {
        textHandler.setNext(imageHandler);
        imageHandler.setNext(audioHandler);
        return textHandler;
    }
}

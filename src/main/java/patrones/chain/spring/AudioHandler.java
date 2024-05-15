package patrones.chain.spring;

import org.springframework.stereotype.Component;

@Component
public class AudioHandler extends AbstractHandler {
    @Override
    public void handleRequest(String requestType, String requestContent) {
        if (requestType.equals("Audio")) {
            System.out.println("Procesando audio");
        } else {
            super.handleRequest(requestType, requestContent);
        }
    }
}


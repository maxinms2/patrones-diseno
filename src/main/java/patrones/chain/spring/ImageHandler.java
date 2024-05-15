package patrones.chain.spring;

import org.springframework.stereotype.Component;

@Component
public class ImageHandler extends AbstractHandler {
    @Override
    public void handleRequest(String requestType, String requestContent) {
        if (requestType.equals("Imagen")) {
            System.out.println("Procesando imagen");
        } else {
            super.handleRequest(requestType, requestContent);
        }
    }
}
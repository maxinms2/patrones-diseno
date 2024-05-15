package patrones.chain.spring;

import org.springframework.stereotype.Component;

@Component
public class TextHandler extends AbstractHandler {
    @Override
    public void handleRequest(String requestType, String requestContent) {
        if (requestType.equals("Texto")) {
            System.out.println("Procesando texto: " + requestContent);
        } else {
            super.handleRequest(requestType, requestContent);
        }
    }
}
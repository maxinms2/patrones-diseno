package patrones.chain.spring;

import org.springframework.stereotype.Component;


@Component
public abstract class AbstractHandler implements Handler {
    protected Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(String requestType, String requestContent) {
        if (next != null) {
            next.handleRequest(requestType, requestContent);
        } else {
            System.out.println("Tipo de solicitud no soportado: " + requestType);
        }
    }
}


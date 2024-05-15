package patrones.chain.spring;

public interface Handler {
    void setNext(Handler next);
    void handleRequest(String requestType, String requestContent);
}
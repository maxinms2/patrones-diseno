package patrones.chain.funcional;

@FunctionalInterface
interface Handler {
    void handleRequest(String requestType, String requestContent);
}


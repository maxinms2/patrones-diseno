package patrones.chain.sinpatron;

public class RequestHandler {
    public void handleRequest(String requestType, String requestContent) {
        if (requestType.equals("Texto")) {
            System.out.println("Procesando texto: " + requestContent);
        } else if (requestType.equals("Imagen")) {
            System.out.println("Procesando imagen");
        } else if (requestType.equals("Audio")) {
            System.out.println("Procesando audio");
        } else {
            System.out.println("Tipo de solicitud no soportado: " + requestType);
        }
    }

    public static void main(String[] args) {
        RequestHandler handler = new RequestHandler();
        handler.handleRequest("Texto", "Hola, esto es un texto de ejemplo");
        handler.handleRequest("Imagen", "imagen.jpg");
        handler.handleRequest("Audio", "audio.mp3");
    }
}


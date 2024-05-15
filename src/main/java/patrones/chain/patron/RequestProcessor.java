package patrones.chain.patron;

interface Handler {
    void setNext(Handler next);
    void handleRequest(String requestType, String requestContent);
}

abstract class AbstractHandler implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handleRequest(String requestType, String requestContent) {
        if (next != null) {
            next.handleRequest(requestType, requestContent);
        } else {
            System.out.println("Tipo de solicitud no soportado: " + requestType);
        }
    }
}

class TextHandler extends AbstractHandler {
    public void handleRequest(String requestType, String requestContent) {
        if (requestType.equals("Texto")) {
            System.out.println("Procesando texto: " + requestContent);
        } else {
            super.handleRequest(requestType, requestContent);
        }
    }
}

class ImageHandler extends AbstractHandler {
    public void handleRequest(String requestType, String requestContent) {
        if (requestType.equals("Imagen")) {
            System.out.println("Procesando imagen");
        } else {
            super.handleRequest(requestType, requestContent);
        }
    }
}

class AudioHandler extends AbstractHandler {
    public void handleRequest(String requestType, String requestContent) {
        if (requestType.equals("Audio")) {
            System.out.println("Procesando audio");
        } else {
            super.handleRequest(requestType, requestContent);
        }
    }
}

public class RequestProcessor {
    public static void main(String[] args) {
        Handler text = new TextHandler();
        Handler image = new ImageHandler();
        Handler audio = new AudioHandler();

        text.setNext(image);
        image.setNext(audio);

        text.handleRequest("Texto", "Hola, esto es un texto de ejemplo");
        text.handleRequest("Imagen", "imagen.jpg");
        text.handleRequest("Audio", "audio.mp3");
    }
}

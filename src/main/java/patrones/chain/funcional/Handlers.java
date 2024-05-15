package patrones.chain.funcional;

public class Handlers {
    public static Handler textHandler = (requestType, requestContent) -> {
        if ("Texto".equals(requestType)) {
            System.out.println("Procesando texto: " + requestContent);
        }
    };

    public static Handler imageHandler = (requestType, requestContent) -> {
        if ("Imagen".equals(requestType)) {
            System.out.println("Procesando imagen");
        }
    };

    public static Handler audioHandler = (requestType, requestContent) -> {
        if ("Audio".equals(requestType)) {
            System.out.println("Procesando audio");
        }
    };
}

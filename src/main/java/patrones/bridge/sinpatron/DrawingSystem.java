package patrones.bridge.sinpatron;

public class DrawingSystem {
    public void drawCircle(String method) {
        if (method.equals("screen")) {
            System.out.println("Dibuja un círculo en la pantalla.");
        } else if (method.equals("print")) {
            System.out.println("Imprime un círculo en papel.");
        }
    }

    public void drawSquare(String method) {
        if (method.equals("screen")) {
            System.out.println("Dibuja un cuadrado en la pantalla.");
        } else if (method.equals("print")) {
            System.out.println("Imprime un cuadrado en papel.");
        }
    }
}

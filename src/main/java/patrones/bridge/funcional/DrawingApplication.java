package patrones.bridge.funcional;

public class DrawingApplication {
    public static void main(String[] args) {
        // Usar referencias a métodos para dibujar en la pantalla
        ShapeDrawing.drawShape(v -> DrawingFunctions.drawCircleOnScreen());
        ShapeDrawing.drawShape(v -> DrawingFunctions.drawSquareOnScreen());

        // Usar referencias a métodos para imprimir en papel
        ShapeDrawing.drawShape(v -> DrawingFunctions.printCircleOnPaper());
        ShapeDrawing.drawShape(v -> DrawingFunctions.printSquareOnPaper());
    }
}


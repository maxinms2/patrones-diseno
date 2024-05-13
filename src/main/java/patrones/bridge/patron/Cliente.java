package patrones.bridge.patron;

public class Cliente {
    public static void main(String[] args) {
        Shape circleOnScreen = new Circle(new ScreenDrawAPI());
        circleOnScreen.draw();

        Shape squareOnPrint = new Square(new PrintDrawAPI());
        squareOnPrint.draw();
    }
}


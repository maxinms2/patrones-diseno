package patrones.interpreter.sinpatron;

public class SimpleExpressionEvaluator {
    public static void main(String[] args) {
        String expression = "10 + 20 - 5";
        System.out.println("Resultado: " + evaluate(expression));
    }

    public static int evaluate(String expression) {
        int result = 0;
        boolean add = true;  // Controla si se suma o resta el siguiente número

        for (String part : expression.split(" ")) {
            if (part.equals("+")) {
                add = true;
            } else if (part.equals("-")) {
                add = false;
            } else {
                int value = Integer.parseInt(part);
                if (add) {
                    result += value;
                } else {
                    result -= value;
                }
            }
        }
        return result;
    }
}

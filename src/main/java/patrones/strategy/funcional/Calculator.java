package patrones.strategy.funcional;

import java.util.function.IntBinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        IntBinaryOperator addOperation = (a, b) -> a + b;
        IntBinaryOperator subtractOperation = (a, b) -> a - b;

        System.out.println("Addition result: " + calculate(num1, num2, addOperation));
        System.out.println("Subtraction result: " + calculate(num1, num2, subtractOperation));
    }

    private static int calculate(int num1, int num2, IntBinaryOperator operation) {
        return operation.applyAsInt(num1, num2);
    }
}


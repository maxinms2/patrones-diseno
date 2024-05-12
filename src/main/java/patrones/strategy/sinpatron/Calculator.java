package patrones.strategy.sinpatron;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        String operation = "add"; // "add" or "subtract"

        int result = 0;
        if (operation.equals("add")) {
            result = num1 + num2;
        } else if (operation.equals("subtract")) {
            result = num1 - num2;
        }

        System.out.println("Result: " + result);
    }
}

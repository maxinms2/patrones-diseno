package patrones.strategy.patron;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public int calculate(int num1, int num2) {
        return operation.calculate(num1, num2);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Calculator addCalculator = new Calculator(new AddOperation());
        System.out.println("Addition result: " + addCalculator.calculate(num1, num2));

        Calculator subtractCalculator = new Calculator(new SubtractOperation());
        System.out.println("Subtraction result: " + subtractCalculator.calculate(num1, num2));
    }
}

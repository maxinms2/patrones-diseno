package patrones.strategy.patron;

public class SubtractOperation implements Operation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}

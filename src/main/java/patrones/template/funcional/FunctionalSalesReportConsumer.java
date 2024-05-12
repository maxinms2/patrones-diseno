package patrones.template.funcional;

import java.util.Arrays;
import java.util.function.Consumer;

public class FunctionalSalesReportConsumer {
    public static void generateReport(int[] data, Consumer<String> display) {
        double total = Arrays.stream(data).sum();
        double average = Arrays.stream(data).average().orElse(0);

        display.accept("Total Sales: " + total);
        display.accept("Average Sales: " + average);
    }
    
    public static void main(String[] args) {
        int[] salesData = {10, 12, 15, 11};
        Consumer<String> consoleDisplay = System.out::println;
        generateReport(salesData, consoleDisplay);
    }
}

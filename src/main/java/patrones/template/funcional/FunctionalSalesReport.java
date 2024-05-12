package patrones.template.funcional;

import java.util.Arrays;

public class FunctionalSalesReport {

    public static void generateReport(int[] data) {
        double total = Arrays.stream(data).sum();  // Uso de stream para calcular el total
        double average = Arrays.stream(data).average().orElse(0);  // Uso de stream para calcular el promedio

        displayReport(total, average);
    }

    private static void displayReport(double total, double average) {
        System.out.println("Total Sales: " + total);
        System.out.println("Average Sales: " + average);
    }
    
    public static void main(String[] args) {
        int[] salesData = {10, 12, 15, 11};
        generateReport(salesData);
    }
}

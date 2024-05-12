package patrones.template.spring;

import org.springframework.stereotype.Component;

@Component
public class SalesReport extends ReportTemplate {

    @Override
    protected double calculateTotal(int[] data) {
        double total = 0;
        for (int sale : data) {
            total += sale;
        }
        return total;
    }
    
    @Override
    protected double calculateAverage(int[] data) {
        return calculateTotal(data) / data.length;
    }

    @Override
    protected void displayReport(double total, double average) {
        System.out.println("Total Sales: " + total);
        System.out.println("Average Sales: " + average);
    }
}
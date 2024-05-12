package patrones.template.spring;

import org.springframework.stereotype.Component;

@Component
public abstract class ReportTemplate {
    public void generateReport(int[] data) {
        double total = calculateTotal(data);
        double average = calculateAverage(data);
        displayReport(total, average);
    }

    protected abstract double calculateTotal(int[] data);
    protected abstract double calculateAverage(int[] data);
    protected abstract void displayReport(double total, double average);
}

package patrones.template.patron;

public abstract class ReportTemplate {
    public final void generateReport(int[] data) {
        double total = calculateTotal(data);
        double average = calculateAverage(data);
        displayReport(total, average);
    }

    protected abstract double calculateTotal(int[] data);
    protected abstract double calculateAverage(int[] data);
    protected abstract void displayReport(double total, double average);
}
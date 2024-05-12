package patrones.template.patron;

public class Cliente {
    public static void main(String[] args) {
        int[] salesData = {10, 12, 15, 11};
        ReportTemplate report = new SalesReport();
        report.generateReport(salesData);
    }
}

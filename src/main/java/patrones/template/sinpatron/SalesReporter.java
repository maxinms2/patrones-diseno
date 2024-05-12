package patrones.template.sinpatron;

public class SalesReporter {

    public static void main(String[] args) {
        int[] salesData = {10, 12, 15, 11};
        generateReport(salesData);
    }

    public static void generateReport(int[] data) {
        int total = 0;
        for (int sale : data) {
            total += sale;
        }
        double average = total / (double) data.length;

        System.out.println("Total Sales: " + total);
        System.out.println("Average Sales: " + average);
    }
}


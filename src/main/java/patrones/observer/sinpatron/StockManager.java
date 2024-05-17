package patrones.observer.sinpatron;

import java.util.Scanner;

public class StockManager {
    static int stockQuantity = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Current stock: " + stockQuantity);
            System.out.print("Enter units sold: ");
            int sold = scanner.nextInt();
            stockQuantity -= sold;

            // Check if stock is low
            if (stockQuantity < 20) {
                System.out.println("Warning: Low stock!");
            }
        }
    }
}

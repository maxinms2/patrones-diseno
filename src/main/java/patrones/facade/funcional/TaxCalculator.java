package patrones.facade.funcional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class TaxCalculator {

    private static final Map<String, BiFunction<Double, Double, Double>> taxRules = new HashMap<>();

    static {
        taxRules.put("electronics", (price, taxRate) -> price * taxRate);
        taxRules.put("clothing", (price, taxRate) -> price * taxRate);
        taxRules.put("books", (price, taxRate) -> price * taxRate);
    }

    public static void main(String[] args) {
        double productPrice = 100.0;
        String productType = "electronics";

        double taxAmount = calculateTax(productType, productPrice);

        System.out.println("Tax amount for the product: " + taxAmount);
    }

    public static double calculateTax(String productType, double productPrice) {
        return taxRules.getOrDefault(productType, (price, taxRate) -> 0.0).apply(productPrice, getTaxRate(productType));
    }

    private static double getTaxRate(String productType) {
        switch (productType) {
            case "electronics":
                return 0.2; // 20% tax for electronics
            case "clothing":
                return 0.1; // 10% tax for clothing
            case "books":
                return 0.05; // 5% tax for books
            default:
                return 0.0; // no tax for unknown product types
        }
    }
}


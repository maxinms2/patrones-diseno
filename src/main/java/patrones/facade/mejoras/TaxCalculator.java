package patrones.facade.mejoras;

import java.util.HashMap;
import java.util.Map;

public class TaxCalculator {

    private final Map<String, TaxStrategy> taxStrategies = new HashMap<>();

    public TaxCalculator() {
        taxStrategies.put("electronics", new ElectronicsTaxStrategy());
        taxStrategies.put("clothing", new ClothingTaxStrategy());
        taxStrategies.put("books", new BooksTaxStrategy());
    }

    public double calculateTax(String productType, double productPrice) {
        TaxStrategy taxStrategy = taxStrategies.getOrDefault(productType, price -> 0.0);
        return taxStrategy.calculateTax(productPrice);
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        double productPrice = 100.0;
        String productType = "electronics";

        double taxAmount = taxCalculator.calculateTax(productType, productPrice);

        System.out.println("Tax amount for the product: " + taxAmount);
    }
}

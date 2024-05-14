package patrones.facade.sinpatron;

public class TaxCalculator {
    
    public static void main(String[] args) {
        double productPrice = 100.0;
        String productType = "electronics";
        
        double taxAmount = 0.0;
        
        if (productType.equals("electronics")) {
            taxAmount = productPrice * 0.2; // 20% tax for electronics
        } else if (productType.equals("clothing")) {
            taxAmount = productPrice * 0.1; // 10% tax for clothing
        } else if (productType.equals("books")) {
            taxAmount = productPrice * 0.05; // 5% tax for books
        }
        
        System.out.println("Tax amount for the product: " + taxAmount);
    }
}


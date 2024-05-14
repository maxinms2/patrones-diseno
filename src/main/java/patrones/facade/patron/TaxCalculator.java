package patrones.facade.patron;

public class TaxCalculator {
    
    public static void main(String[] args) {
        double productPrice = 100.0;
        String productType = "electronics";
        
        TaxFacade taxFacade = new TaxFacade();
        double taxAmount = taxFacade.calculateTax(productType, productPrice);
        
        System.out.println("Tax amount for the product: " + taxAmount);
    }
}

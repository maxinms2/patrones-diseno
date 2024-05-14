package patrones.facade.mejoras;

class ClothingTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double productPrice) {
        return productPrice * 0.1; // 10% tax for clothing
    }
}

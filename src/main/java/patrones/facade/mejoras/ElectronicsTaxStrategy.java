package patrones.facade.mejoras;

class ElectronicsTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double productPrice) {
        return productPrice * 0.2; // 20% tax for electronics
    }
}

package patrones.facade.mejoras;

class BooksTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double productPrice) {
        return productPrice * 0.05; // 5% tax for books
    }
}
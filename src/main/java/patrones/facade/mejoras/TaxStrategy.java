package patrones.facade.mejoras;

@FunctionalInterface
interface TaxStrategy {
    double calculateTax(double productPrice);
}

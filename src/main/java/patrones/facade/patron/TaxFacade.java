package patrones.facade.patron;


class TaxFacade {
    public double calculateTax(String productType, double productPrice) {
        if (productType.equals("electronics")) {
            return productPrice * 0.2; // 20% tax for electronics
        } else if (productType.equals("clothing")) {
            return productPrice * 0.1; // 10% tax for clothing
        } else if (productType.equals("books")) {
            return productPrice * 0.05; // 5% tax for books
        } else {
            return 0.0; // no tax for unknown product types
        }
    }
}

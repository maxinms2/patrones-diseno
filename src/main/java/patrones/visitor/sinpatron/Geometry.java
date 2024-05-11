package patrones.visitor.sinpatron;

public class Geometry {
    public static void main(String[] args) {
        // Datos de ejemplo: tipo de figura y sus dimensiones
        String figureType = "circle"; // Tipos posibles: "circle", "square"
        double radius = 5;
        double side = 10;

        // Cálculo basado en el tipo
        if ("circle".equals(figureType)) {
            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;
            System.out.println("Área del círculo: " + area);
            System.out.println("Perímetro del círculo: " + perimeter);
        } else if ("square".equals(figureType)) {
            double area = side * side;
            double perimeter = 4 * side;
            System.out.println("Área del cuadrado: " + area);
            System.out.println("Perímetro del cuadrado: " + perimeter);
        }
    }
}


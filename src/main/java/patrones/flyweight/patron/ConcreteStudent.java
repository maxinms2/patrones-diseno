package patrones.flyweight.patron;

public class ConcreteStudent implements Student {
    private String name;

    public ConcreteStudent(String name) {
        this.name = name;
    }

    @Override
    public void generateReport() {
        System.out.println("Reporte del estudiante: " + name);
    }
}

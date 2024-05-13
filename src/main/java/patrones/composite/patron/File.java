package patrones.composite.patron;

class File implements Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Archivo: " + name);
    }
}
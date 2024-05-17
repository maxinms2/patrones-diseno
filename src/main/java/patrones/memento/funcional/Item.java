package patrones.memento.funcional;


public class Item {
    private final String state;

    public Item(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Item changeState(String newState) {
        return new Item(newState); // Retorna una nueva instancia en lugar de modificar el estado actual
    }
}


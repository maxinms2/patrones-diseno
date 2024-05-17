package patrones.memento.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

public class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }

    // Función que retorna una función para obtener mementos basado en su índice
    public IntFunction<Memento> mementoGetter() {
        return index -> mementoList.get(index);
    }
}
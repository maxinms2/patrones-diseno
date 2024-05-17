package patrones.observer.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StockManager {
    private int stockQuantity = 100;
    private List<Consumer<Integer>> observers = new ArrayList<>();

    public void addObserver(Consumer<Integer> observer) {
        observers.add(observer);
    }

    public void sellProduct(int quantity) {
        stockQuantity -= quantity;
        notifyObservers(stockQuantity);
    }

    private void notifyObservers(int stockQuantity) {
        observers.forEach(observer -> observer.accept(stockQuantity));
    }
}


package patrones.observer.patron;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface StockObserver {
	void update(int stockLevel);
}

class LowStockAlert implements StockObserver {
	public void update(int stockLevel) {
		if (stockLevel < 20) {
			System.out.println("Warning: Low stock!");
		}
	}
}

class StockManager {
	private int stockQuantity = 100;
	private List<StockObserver> observers = new ArrayList<>();

	public void addObserver(StockObserver observer) {
		observers.add(observer);
	}

	public void sellProduct(int quantity) {
		stockQuantity -= quantity;
		System.out.println("Current stock: " + stockQuantity);
		notifyObservers();
	}

	private void notifyObservers() {
		for (StockObserver observer : observers) {
			observer.update(stockQuantity);
		}
	}

	public static void main(String[] args) {
		StockManager manager = new StockManager();
		manager.addObserver(new LowStockAlert());

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Enter units sold: ");
			int sold = scanner.nextInt();
			manager.sellProduct(sold);
		}
	}
}

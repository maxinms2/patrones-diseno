package patrones.observer.funcional;

public class Cliente {
	public static void main(String[] args) {
		StockManager manager = new StockManager();

		// Agrega observadores
		manager.addObserver(stock -> {
			if (stock < 20)
				System.out.println("Warning: Low stock!");
		});

		manager.addObserver(stock -> {
			if (stock < 10)
				System.out.println("Alert: Stock critically low!");
		});

		// Simula ventas
		manager.sellProduct(5);
		manager.sellProduct(10);
		manager.sellProduct(10);
		manager.sellProduct(60);
		manager.sellProduct(15);
	}

}

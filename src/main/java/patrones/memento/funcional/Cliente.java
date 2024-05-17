package patrones.memento.funcional;

import java.util.function.Function;

public class Cliente {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Item initialItem = new Item("available");

		Function<String, Item> changeState = state -> {
			Item newItem = initialItem.changeState(state);
			caretaker.addMemento(new Memento(newItem.getState()));
			return newItem;
		};

		Item reservedItem = changeState.apply("reserved");
		Item soldItem = changeState.apply("sold");

		// Uso de la función de getter del caretaker
		System.out.println("Restored to: " + caretaker.mementoGetter().apply(0).getState()); // Debería mostrar
																								// "reserved"
	}
}

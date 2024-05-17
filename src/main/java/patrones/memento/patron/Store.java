package patrones.memento.patron;

import java.util.*;

//Originator
class Item {
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}

//Memento
class Memento {
	private final String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}

//Caretaker
class Caretaker {
	private List<Memento> mementoList = new ArrayList<>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
}

public class Store {
	public static void main(String[] args) {
		Item item = new Item();
		Caretaker caretaker = new Caretaker();

		item.setState("available");
		caretaker.add(item.saveStateToMemento());

		item.setState("reserved");
		caretaker.add(item.saveStateToMemento());

		item.setState("sold");
		System.out.println("Current State: " + item.getState());

		item.getStateFromMemento(caretaker.get(1));
		System.out.println("First restored state: " + item.getState());

		item.getStateFromMemento(caretaker.get(0));
		System.out.println("Second restored state: " + item.getState());
	}
}

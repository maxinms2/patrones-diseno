package patrones.mediator.patron;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Mediator {
	void addUser(User user);

	void sendMessage(User sender, String receiver, String message);
}

class MessagingMediator implements Mediator {
	private List<User> users = new ArrayList<>();
	private Map<String, List<String>> userMessages = new HashMap<>();

	@Override
	public void addUser(User user) {
		users.add(user);
		userMessages.put(user.getName(), new ArrayList<>());
	}

	@Override
	public void sendMessage(User sender, String receiver, String message) {
		for (User user : users) {
			if (user.getName().equals(receiver)) {
				user.receiveMessage(sender, message);
				return;
			}
		}
		System.out.println("User not found.");
	}
}

class User {
	private String name;
	private Mediator mediator;

	public User(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
		this.mediator.addUser(this);
	}

	public String getName() {
		return name;
	}

	public void sendMessage(String receiver, String message) {
		mediator.sendMessage(this, receiver, message);
	}

	public void receiveMessage(User sender, String message) {
		System.out.println("From " + sender.getName() + ": " + message);
	}
}

public class MediatorPatternExample {
	public static void main(String[] args) {
		Mediator mediator = new MessagingMediator();
		User alice = new User("Alice", mediator);
		User bob = new User("Bob", mediator);

		alice.sendMessage("Bob", "Hello, Bob!");
		bob.sendMessage("Alice", "Hi, Alice!");
	}
}

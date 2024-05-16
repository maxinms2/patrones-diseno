package patrones.mediator.sinpatron;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessagingSystem {

	private List<String> users = new ArrayList<>();
	private Map<String, List<String>> userMessages = new HashMap<>();

	public void addUser(String username) {
		users.add(username);
		userMessages.put(username, new ArrayList<>());
	}

	public void sendMessage(String sender, String receiver, String message) {
		if (users.contains(sender) && users.contains(receiver)) {
			userMessages.get(receiver).add("From " + sender + ": " + message);
		} else {
			System.out.println("User not found.");
		}
	}

	public void displayMessages(String username) {
		if (users.contains(username)) {
			List<String> messages = userMessages.get(username);
			for (String message : messages) {
				System.out.println(message);
			}
		} else {
			System.out.println("User not found.");
		}
	}

	public static void main(String[] args) {
		MessagingSystem system = new MessagingSystem();
		system.addUser("Alice");
		system.addUser("Bob");

		system.sendMessage("Alice", "Bob", "Hello, Bob!");
		system.sendMessage("Bob", "Alice", "Hi, Alice!");

		system.displayMessages("Bob");
	}
}

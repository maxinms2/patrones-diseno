package patrones.mediator.funcional;

public class Cliente {
	public static void main(String[] args) {
		Mediator mediator = new MessagingMediator();
		User alice = new User("Alice", mediator);
		User bob = new User("Bob", mediator);

		alice.sendMessage("Bob", "Hello, Bob!");
		bob.sendMessage("Alice", "Hi, Alice!");
	}
}

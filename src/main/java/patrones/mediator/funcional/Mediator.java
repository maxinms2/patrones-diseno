package patrones.mediator.funcional;

interface Mediator {
	void addUser(User user);

	void sendMessage(User sender, String receiver, String message);
}

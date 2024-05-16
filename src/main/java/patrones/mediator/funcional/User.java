package patrones.mediator.funcional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class User {
    private String name;
    private final Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
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


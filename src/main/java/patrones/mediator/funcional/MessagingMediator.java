package patrones.mediator.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MessagingMediator implements Mediator {
    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(User sender, String receiver, String message) {
        users.stream()
            .filter(user -> user.getName().equals(receiver))
            .findFirst()
            .ifPresent(user -> user.receiveMessage(sender, message));
    }
}

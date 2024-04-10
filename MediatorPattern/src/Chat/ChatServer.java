package Chat;

import java.util.ArrayList;
import java.util.List;

public class ChatServer implements ChatMediator {
    private List<User> users;

    public ChatServer() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(User user, String message) {
        for (User u : users) {
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
import java.util.ArrayList;
import java.util.List;

public class FakeDatabase {
    private static FakeDatabase instance;
    private final List<User> users;

    private FakeDatabase() {
        users = new ArrayList<>();
    }

    public static FakeDatabase getInstance() {
        if (instance == null) {
            instance = new FakeDatabase();
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

}

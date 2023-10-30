import java.util.ArrayList;
import java.util.List;

public class Manager extends User {
    private List<User> team;

    public Manager(int id, String name, int age, double hourlyRate) {
        super(id, name, age, hourlyRate, 0);
        team = new ArrayList<>();
    }

    @Override
    public double calculateBudget() {
        double budget = 0;
        for (User team : team) {
            budget += team.calculateBudget();
        }
        return budget;
    }

    @Override
    public List<User> getTeam() {
        return team;
    }

    public void addTeam(User user) {
        team.add(user);
    }
}

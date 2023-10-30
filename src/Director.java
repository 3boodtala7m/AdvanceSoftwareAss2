import java.util.ArrayList;
import java.util.List;

public class Director extends User {
    private List<User> team;

    public Director(int id, String name, int age, double hourlyRate) {
        super(id, name, age, hourlyRate, 0);
        team = new ArrayList<>();
    }

    @Override
    public double calculateBudget() {
        double budget = 0;
        for (User teamMember : team) {
            budget += teamMember.calculateBudget();
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

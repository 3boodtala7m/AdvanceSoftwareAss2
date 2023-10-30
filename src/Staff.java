import java.util.List;

public class Staff extends User {
    public Staff(int id, String name, int age, double hourlyRate, int totalHours) {
        super(id, name, age, hourlyRate, totalHours);
    }

    @Override
    public double calculateBudget() {
        return getHourlyRate() * getTotalHours();
    }

    @Override
    public List<User> getTeam() {
        return null;
    }
}

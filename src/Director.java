import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {
    private List<Employee> subordinates;

    public Director(int id, String name, int age, double hourlyRate) {
        super(id, name, age, hourlyRate, 0);
        subordinates = new ArrayList<>();
    }

    @Override
    public double calculateBudget() {
        double budget = 0;
        for (Employee subordinate : subordinates) {
            budget += subordinate.calculateBudget();
        }
        return budget;
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }
}

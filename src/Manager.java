import java.util.List;
import java.util.ArrayList;

public class Manager extends Employee {
    private List<Employee> subordinates;

    public Manager(int employeeId, String employeeName, int employeeAge, double hourlyRate) {
        super(employeeId, employeeName, employeeAge, hourlyRate, 0);
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

    public void addSubordinate(Employee subordinate) {
        subordinates.add(subordinate);
    }
}

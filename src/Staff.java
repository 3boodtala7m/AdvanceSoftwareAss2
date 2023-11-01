import java.util.List;

public class Staff extends Employee {
    public Staff(int employeeId, String employeeName, int employeeAge, double hourlyRate, int totalHoursWorked) {
        super(employeeId, employeeName, employeeAge, hourlyRate, totalHoursWorked);
    }

    @Override
    public double calculateBudget() {
        return getHourlyRate() * getTotalHoursWorked();
    }

    @Override
    public List<Employee> getSubordinates() {
        return null;  // Staff doesn't have subordinates
    }
}

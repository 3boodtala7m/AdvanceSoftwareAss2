import java.util.List;

public abstract class Employee {
    private int employeeId;
    private String employeeName;
    private int employeeAge;
    private double hourlyRate;
    private int totalHoursWorked;

    public Employee(int employeeId, String employeeName, int employeeAge, double hourlyRate, int totalHoursWorked) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.hourlyRate = hourlyRate;
        this.totalHoursWorked = totalHoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public abstract double calculateBudget();
    public abstract List<Employee> getSubordinates();
}

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    private static EmployeeDatabase instance;
    private final List<Employee> employees;

    private EmployeeDatabase() {
        employees = new ArrayList<>();
    }

    public static EmployeeDatabase getInstance() {
        if (instance == null) {
            instance = new EmployeeDatabase();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

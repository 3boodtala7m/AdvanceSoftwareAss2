public class ReportGenerator {
    public void generateEmployeeListReport(Employee employee) {
        System.out.println("Employee: " + employee.getEmployeeName() + "'s Subordinates:");
        for (Employee subordinate : employee.getSubordinates()) {
            System.out.println(subordinate.getEmployeeName());
        }
    }

    public void generateBudgetReport(Employee employee) {
        double budget = employee.calculateBudget();
        System.out.println("Employee: " + employee.getEmployeeName() + "'s Required Budget: $" + budget);
    }
}

public class Main {
    public static void main(String[] args) {

        EmployeeDatabase database = EmployeeDatabase.getInstance();

        Employee staff1 = new Staff(1001, "Abdullah", 28, 17.5, 160);
        Employee staff2 = new Staff(1002, "Shaher", 32, 19.75, 175);
        Employee staff3 = new Staff(1003, "Mohammed", 24, 15.0, 140);

        Employee managerA = new Manager(2001, "Ahmad", 35, 25.0);
        Employee managerB = new Manager(2002, "Salameh", 40, 23.5);

        ((Manager) managerA).addSubordinate(staff1);
        ((Manager) managerB).addSubordinate(staff2);
        ((Manager) managerA).addSubordinate(staff3);

        Employee directorX = new Director(3001, "Mostafa", 42, 30.0);

        ((Director) directorX).addSubordinate(managerA);
        ((Director) directorX).addSubordinate(managerB);

        database.addEmployee(staff1);
        database.addEmployee(staff2);
        database.addEmployee(staff3);
        database.addEmployee(managerA);
        database.addEmployee(managerB);
        database.addEmployee(directorX);

        ReportGenerator reportGenerator = new ReportGenerator();

        displayHeader("Company Report");

        displaySectionHeader("Director Report");
        reportGenerator.generateEmployeeListReport(directorX);
        reportGenerator.generateBudgetReport(directorX);

        displaySectionHeader("Manager Report");
        reportGenerator.generateEmployeeListReport(managerA);
        reportGenerator.generateBudgetReport(managerA);

        displayFooter("End of Report");
    }

    private static void displayHeader(String title) {
        String border = "=".repeat(50);
        System.out.println(border);
        System.out.println(title);
        System.out.println(border);
    }

    private static void displaySectionHeader(String sectionTitle) {
        System.out.println("\n>> " + sectionTitle);
    }

    private static void displayFooter(String message) {
        String border = "=".repeat(50);
        System.out.println(border);
        System.out.println(message);
        System.out.println(border);
    }
}

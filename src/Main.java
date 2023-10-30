public class Main {
    public static void main(String[] args) {

        FakeDatabase db = FakeDatabase.getInstance();

        Staff employee1 = new Staff(1001, "Abdullah", 28, 17.5, 160);
        Staff employee2 = new Staff(1002, "Shaher", 32, 19.75, 175);
        Staff employee3 = new Staff(1003, "Mohammed", 24, 15.0, 140);

        Manager managerA = new Manager(2001, "Ahmad", 35, 25.0);
        Manager managerB = new Manager(2002, "Salameh", 40, 23.5);

        managerA.addTeam(employee1);
        managerB.addTeam(employee2);
        managerA.addTeam(employee3);

        Director directorX = new Director(3001, "Mostafa", 42, 30.0);

        directorX.addTeam(managerA);
        directorX.addTeam(managerB);

        db.addUser(employee1);
        db.addUser(employee2);
        db.addUser(employee3);
        db.addUser(managerA);
        db.addUser(managerB);
        db.addUser(directorX);

        ReportGenerator reportGenerator = new ReportGenerator();

        displayHeader("Company Report");

        displaySectionHeader("Director Report");
        reportGenerator.generateStaffListReport(directorX);
        reportGenerator.generateRequiredBudgetReport(directorX);

        displaySectionHeader("Manager Report");
        reportGenerator.generateStaffListReport(managerA);
        reportGenerator.generateRequiredBudgetReport(managerA);

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

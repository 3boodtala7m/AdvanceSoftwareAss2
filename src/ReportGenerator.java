public class ReportGenerator {
    public void generateStaffListReport(User user) {
        System.out.println(user.getName() + "'s teams':");
        for (User team : user.getTeam()) {
            System.out.println(team.getName());
        }
    }

    public void generateRequiredBudgetReport(User user) {
        double budget = user.calculateBudget();
        System.out.println(user.getName() + "'s Required Budget: $" + budget);
    }
}

import java.util.List;

public abstract class User {
    private int id;
    private String name;
    private int age;
    private double hourlyRate;
    private int totalHours;

    public User(int id, String name, int age, double hourlyRate, int totalHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public abstract double calculateBudget();
    public abstract List<User> getTeam();

}

import java.util.Random;

public class Operator implements EmployeePosition {
    String jobName;
    double salary;
    public Operator() {
        jobName = "operator";
    }

    @Override
    public String getJobTitle() {
        return jobName;
    }

    public double getSalary() {
        return salary;
    }
    public int getDohod(){
        return 0;
    }
    @Override
    public double calcSalary(double baseSalary) {
        Random rand = new Random();
        salary = baseSalary + ((115000 + rand.nextInt() % 140000) * 1.5);
        return baseSalary;
    }
}

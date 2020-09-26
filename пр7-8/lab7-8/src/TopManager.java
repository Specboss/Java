import java.util.Random;

public class TopManager implements EmployeePosition {
    String jobName;
    Company cmp;
    double salary;
    int dohod;
    public TopManager(Company c) {
        this.jobName = "Top manager";
        cmp = c;
        Random rand = new Random();
        dohod = 115000 + rand.nextInt() % 140000;
    }
    public int getDohod(){
        return dohod;
    }
    @Override
    public String getJobTitle() {
        return jobName;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public double calcSalary(double baseSalary){

        if(cmp.getInCome() > 10000000) {
            salary = baseSalary + (dohod * 1.5);
            return salary;
        }
        else {
            return baseSalary;
        }
    }
}

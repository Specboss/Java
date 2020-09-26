import java.util.Random;

public class Manager implements EmployeePosition {
   protected String jobName;
   double salary;
   int dohod;
   public Manager(){
       this.jobName= "Manager";
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
    public double calcSalary(double baseSalary) {
        salary = baseSalary + (dohod * 1.5);
        return salary;
    }

    /*public void printJobInfo(){
       System.out.println("Manager, Salary = ");
    }*/
}

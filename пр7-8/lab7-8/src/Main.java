public class Main {
    public static void main(String args[]) {
        Company company = new Company();
        for (int i = 0; i < 180; i++) {
            Employee operator = new Employee(String.valueOf(i), "Alex", 34000, new Operator());
            company.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee operator = new Employee(String.valueOf(i), "Bob", 80000, new Manager());
            company.hire(operator);
        }
        for (int i = 0; i < 10; i++) {
            Employee operator = new Employee(String.valueOf(i), "Steve", 90000, new TopManager(company));
            company.hire(operator);
        }
        company.printAll();
        int i = 1;
        System.out.println("_____________TOP 15______________");
        for(Employee e  : company.getTopSalaryStaff(15)){
            System.out.println(i + ". " + e.getPos().getSalary());
            i++;
        }
        i = 1;
        System.out.println("_____________LOW 30______________");
        for(Employee e  : company.getLowestSalaryStaff(30)){
            System.out.println(i + ". " + e.getPos().getSalary());
            i++;
        }
        for (int j = 0; i < company.getEmployersCount() / 2; j++){
            company.fire(0);
        }
        i = 1;
        System.out.println("_____________TOP 10______________");
        for(Employee e  : company.getTopSalaryStaff(10)){
            System.out.println(i + ". " + e.getPos().getSalary());
            i++;
        }
        i = 1;
        System.out.println("_____________LOW 30______________");
        for(Employee e  : company.getLowestSalaryStaff(30)){
            System.out.println(i + ". " + e.getPos().getSalary());
            i++;
        }
    }
}

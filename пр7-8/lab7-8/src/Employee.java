public class Employee {
    String sourname;
    String name;
    double baseSalary;
    EmployeePosition pos;

    public Employee(String sourname, String name, double baseSalary, EmployeePosition pos) {
        this.sourname = sourname;
        this.name = name;
        this.baseSalary = baseSalary;
        this.pos = pos;
        pos.calcSalary(baseSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public EmployeePosition getPos() {
        return pos;
    }

    public void setPos(EmployeePosition pos) {
        this.pos = pos;
    }

    public String getSourname() {
        return sourname;
    }

    public void setSourname(String sourname) {
        this.sourname = sourname;
    }
}




import java.util.ArrayList;
import java.util.WeakHashMap;

public class Company {
    private ArrayList<Employee> hiredEmployee = new ArrayList<Employee>();

    public Company(){}

    public void hire(Employee employee) {
        hiredEmployee.add(employee);
    }

    public void fire(int num) {
        hiredEmployee.remove(num);
    }

}

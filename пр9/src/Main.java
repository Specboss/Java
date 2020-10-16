


import java.util.Calendar;

public class Main {
    public static void main(String [] args) {
        final Employee a = new Employee("s","b","r",8800, 22, Calendar.getInstance());

        Calendar birthDate = Calendar.getInstance();
        Calendar birthDate1 = Calendar.getInstance();
        birthDate.set(2100, 2, 21);
        a.setBirthDate(birthDate);

        final Employee b = new Employee("s","b","r",8800, 22, Calendar.getInstance());

        birthDate1.set(5550, 11, 21);
        b.setBirthDate(birthDate1);

        HandleEmployees(a);
        HandleEmployees(b);

    }

    private static void HandleEmployees (Employee employee) {
        employee.getBirthDate();
        final Company company = new Company(){

            @Override
            public void hire(final Employee employee) {
                for (int i = 0; i < 3; i++) {
                    super.hire(employee);
                }
                // Анонимный класс
                Cycle cycle = new Cycle() {
                    @Override
                    public void print() {
                        System.out.println(employee.toString());
                    }
                };
                Sum sum;

                // Лямбда
                sum = (employee1) -> employee1.getPhoneNumber() * 3;
                int result = sum.calculatePhoneNums(employee);
                System.out.println(result);

            }

            @Override
            public void fire(int num) {

                super.fire(num);
            }


        };

        company.hire(employee);
        company.fire(0);

    }
}


interface Cycle {
    void print();
}

interface Sum {
    int calculatePhoneNums(Employee employee);
}


import java.util.Calendar;
import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private String address;
    private int phoneNumber;
    private double salary;
    private Calendar birthDate;

    public Employee(String firstName, String lastName, String address, int phoneNumber, double salary, Calendar birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public void getBirthDate(){
        System.out.println(birthDate.getTime());
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "+" + birthDate.getTime();
    }
}

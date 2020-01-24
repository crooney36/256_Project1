// ******************************************************************
// Charles Rooney - CMSC 256 - Section 2
// Started on 1/15/2020
// Project 1 - Inheritance
// This class creates an employee object which inherits the methods and variables from the Person class. It adds in addition to these
// an office, salary and hireDate variables.
// ******************************************************************
package cmsc256;
import java.time.LocalDate;

public class Employee extends Person {
    // Instance variables for Employee class.
    private String office;
    private int salary;
    private LocalDate hireDate;

    // Default constructor for Employee object.
    public Employee(){
        super();
        this.office = "Unassigned";
        this.salary = 0;
        this.hireDate = null;
    }
    // Parameterized constructor for Employee object.
    public Employee(String first, String middle, String last , Address address, String phoneNumber, String email, String office, int salary, int month, int day, int year){
        super(first, middle, last, address, phoneNumber, email);
        this.office = office;
        if(salary < 0) {
            throw new IllegalArgumentException("Salary must be a positive integer.");
        }
            this.salary = salary;
        hireDate = LocalDate.of(year, month, day);
    }
    // Inherits the toString method from Person class and adds the additional variables from the Employee class.
    public String toString(){
        String result = super.toString();
        result += "Office: " + office + "\n";
        result += "Salary: $" + salary + "\n";
        if (hireDate != null){
            result += "Date hired: " + hireDate.getMonthValue() + "/" + hireDate.getDayOfMonth() + "/" + hireDate.getYear() + "\n";
        }
        else{
            result += "Date hired: " + null + "\n";
        }
        return result;
    }
}
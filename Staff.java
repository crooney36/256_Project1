// ******************************************************************
// Charles Rooney - CMSC 256 - Section 2
// Started on 1/15/2020
// Project 1 - Inheritance
/// This class creates a Staff object which inherits the variables and methods from the Employee class. It adds a title variable in addition.
// ******************************************************************
package cmsc256;

public class Staff extends Employee {
    // Instance Variable for Staff class.
    private String title;

    // Default constructor for Staff class.
    public Staff(){
        super();
        title = "None given";
    }
    // Parameterized constructor for Staff class.
    public Staff(String first, String middle, String last , Address address, String phoneNumber, String email, String office, int salary, int month, int day, int year, String title){
        super(first, middle, last, address, phoneNumber, email, office, salary, month, day, year);
        this.title = title;
    }
    // Inherits the toString method from parent class (Employee) and adds the additional variables from the Staff class.
    public String toString(){
        String result = super.toString();
        result += "\n" + "Title: " + title + "\n";
        return result;
    }
}

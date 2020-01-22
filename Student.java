// ******************************************************************
// Charles Rooney - CMSC 256 - Section 2
// Started on 1/15/2020
// Project 1 - Inheritance
// This class creates a Student object which inherits the methods and variables from the Person object. It adds in addition to these
// a class level as well as a method to check the validity of the level.
// ******************************************************************
package cmsc256;

public class Student extends Person {
    // Instance variable for Student class.
    private String level;

    // Default constructor for Student object.
    public Student(){
        super();
        level = "Freshman";
    }

    // Parameterized constructor for Student object.
    public Student(String first, String middle, String last , Address address, String phoneNumber, String email, String level){
        super(first, middle, last, address, phoneNumber, email);
        if(isValidLevel(level)){
            this.level = level;
        }
        else{
            throw new IllegalArgumentException("Please enter a valid level.");
        }
    }
    // Returns true if the entered level is one of the 5 valid strings, otherwise false. Checks validity of the level variable.
    public boolean isValidLevel(String a){
        if (a.equalsIgnoreCase("Freshman")){
            return true;
        }
        else if(a.equalsIgnoreCase("Sophomore")){
            return true;
        }
        else if(a.equalsIgnoreCase("Junior")){
            return true;
        }
        else if(a.equalsIgnoreCase("Senior")){
            return true;
        }
        else if(a.equalsIgnoreCase("Graduate")){
            return true;
        }
        else{
            return false;
        }
    }
    // Inherits the toString method from parent class (Person) and adds the additional variables from the Student class.
    public String toString(){
        String result = super.toString();
        result += "Student Level: " + level + "\n";
        return result;
    }
}

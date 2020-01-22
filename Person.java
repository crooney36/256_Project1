// ******************************************************************
// Charles Rooney - CMSC 256 - Section 2
// Started on 1/15/2020
// Project 1 - Inheritance
// This class creates a Person object that has the variables id, record number, phoneNumber, email, address and first/middle/last name
// as well as relevant methods relating to the object.
// ******************************************************************
package cmsc256;

public class Person {
    // Instance variables for Person class.
    private int id;
    private static int recordNumber = 0;
    private String phoneNumber, email, first, middle, last;
    private Address address;
    private Name name;

    // Default constructor for Person class.
    public Person() {
        name = new Name();
        id = ++recordNumber;
        address = new Address();
        phoneNumber = "None given";
        email = "None given";
    }
    // Parameterized constructor for Person class.
    public Person(String first, String middle, String last , Address address, String phoneNumber, String email) {
        this.id = ++recordNumber;
        if(middle == null){
            this.name = new Name(first, last);
        }
        else{
            this.name = new Name(first, middle, last);
        }
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
   public String getName(){
        return name.toString();
   }

    // For the toString method, I created 3 string variables and assign the first 2 to their corresponding toString methods. The 3rd, c, is assigned to
    // the String of the class by calling getClass().toString. I then run c through a method I made to cut out the first 6 letters of the String being "Class "
    // in order to satisfy the desired output in the project manual.
    // This is important because my other classes inherit the toString form from Person. So, in the Faculty
    // class for example, it will "title" the output with the proper class "Faculty : ". This would not have been possible to do
    // based on the way I built this program.

    public String toString() {
        String a = name.toString();
        String b = address.toString();
        String c = getClass().toString();
        c = trimClass(c);
        String result = c + ":" + "\n";
        result += "---------------------------------------\n" +  a + "\n" + "---------------------------------------\n";
        result += "Home Address: " + b + "\n";
        result += "Phone number: " + phoneNumber + "\n";
        result += "Email Address: " + email + "\n";
        result += "ID: " + id + "\n";
        return result;
    }

    // As described above, this method trims the first 6 letters of getClass().toString() and transforms it from
    // "class Student: " to just "Student: " or any of the other classes.
    public String trimClass(String a) {
        String className = "";
        for (int i = 14; i < a.length(); i++) {
            className += a.charAt(i);
        }
        return className;
    }
}
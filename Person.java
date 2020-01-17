//
// Charles Rooney - CMSC 256 - Section 2
// 1/15/2020
//
public class Person {
    private int id;
    private static int recordNumber = 0;
    private String phoneNumber, email, first, middle, last;
    private Address address;
    private Name name;

    // Default constructor for Person class.
    public Person() {
        this.name = new Name ("John", "Smith");
        this.id = ++recordNumber;
        this.address = null;
        this.phoneNumber = "None given";
        this.email = "None given";

    }
    // Parameterized constructor for Person class.
    public Person(String first, String middle, String last , Address address, String phoneNumber, String email) {
        this.id = ++recordNumber;
        this.name = new Name(first, middle, last);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

   // public String getName() {
   //     return name;
   // }
    public String toString() {
        String a = name.toString();
        String b = address.toString();
        String result = "----------" + "\n" + a + "\n" + "----------" + "\n";
        result += b + "\n";
        result += "Phone number: " + phoneNumber + "\n";
        result += "Email Address:" + email + "\n";
        result += "ID:" + id + "\n";
        return result;
    }

}
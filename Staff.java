public class Staff extends Employee {
    private String title;

    // Default constructor for Staff class.
    public Staff(){
        super();
        title = "None given";
    }
    // Parameterized constructor for Staff class.
    public Staff(String first, String middle, String last , Address address, String phoneNumber, String email, String level, int salary, String title){
        super();
        this.title = title;
    }
    // ToString method for Staff class. Calls the toString method from the parent class (Employee) and adds the title on to the end.
    public String toString(){
        String result = super.toString();
        result += "\n" + "Title: " + "\n";
        return result;
    }
}

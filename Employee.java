import javax.naming.Name;

public class Employee extends Person {
    private String office;
    private int salary;

    // Default employee constructor.
    public Employee(){
        super();
        this.office = "Unassigned";
        this.salary = 0;
    }
    // Parameterized employee constructor.
    public Employee(String first, String middle, String last , Address address, String phoneNumber, String email, String level, int salary){
        super();
        this.office = office;
        this.salary = salary;
    }
    public String toString(){
        String result = super.toString();
        result += "Office: " + office + "\n";
        result += "Salary: " + salary + "\n";
        result += "Date hired: " + "\n";
        return result;
    }
}

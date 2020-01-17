import javax.naming.Name;
import javax.xml.ws.soap.AddressingFeature;

public class Student extends Person {
    private String level;

    // Default constructor for Student.
    public Student(){
        super();
        level = "Freshman";
    }

    // Parameterized constructor for Student.
    public Student(String first, String middle, String last , Address address, String phoneNumber, String email, String level){
        super();
        this.level = level;
    }
    // Returns true if the entered level is one of the 4 valid strings, otherwise false.
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
        else{
            return false;
        }
    }
    // Returns the Student object as a string.
    public String toString(){
        String result = super.toString();
        result += "level" + "\n";
        return result;
    }
}

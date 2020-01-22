// ******************************************************************
// Charles Rooney - CMSC 256 - Section 2
// Started on 1/15/2020
// Project 1 - Inheritance
// This class inherits the variables and methods from the Employee class and adds a rank as well as a method to check
// the validity of this rank.
// ******************************************************************
package cmsc256;

public class Faculty extends Employee {
    // Instance variable for Faculty class.
    private String rank;

        // Default constructor for Faculty object.
        public Faculty(){
            super();
            rank = "Instructor";
        }

        // Parameterized constructor for Faculty object.
        public Faculty(String first, String middle, String last , Address address, String phoneNumber, String email, String office, int salary, int month, int day, int year, String rank){
            super(first, middle, last, address, phoneNumber, email, office, salary, month, day, year);
            if(isValidRank(rank)){
                this.rank = rank;
            }
            else{
                throw new IllegalArgumentException("Please enter a valid rank.");
            }

        }
        // Checks validity of rank variable. Returns true if the rank is valid, and false if not using if else statements.
        private boolean isValidRank(String a){
            if(a.equalsIgnoreCase("Adjunct")){
                return true;
            }
            else if(a.equalsIgnoreCase("Instructor")){
                return true;
            }
            else if(a.equalsIgnoreCase("Assistant Professor")){
                return true;
            }
            else if(a.equalsIgnoreCase("Associate Professor")){
                return true;
            }
            else if(a.equalsIgnoreCase("Professor")){
                return true;
            }
            else{
                return false;
            }
        }
        // Inherits the toString method from parent class (Employee) and adds the additional variables from the Faculty class.
        public String toString(){
            String result = super.toString();
            result += "Rank: " + rank + "\n";
            return result;
        }
}

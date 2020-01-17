public class Faculty extends Employee {
    private String rank;

        public Faculty(){
            super();
            rank = "Instructor";
        }

        public Faculty(String first, String middle, String last , Address address, String phoneNumber, String email, String level, int salary, String title){
            super();
            this.rank = rank;
        }
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
            else if(a.equalsIgnoreCase(" Associate Professor")){
                return true;
            }
            else if(a.equalsIgnoreCase(" Professor")){
                return true;
            }
            else{
                return false;
            }
        }
        // ToString method for Faculty class. Calls the toString method from the parent class (Employee) and adds the rank on to the end.
        public String toString(){
            String result = super.toString();
            result += "Rank: " + rank + "\n";
            return result;
        }

}

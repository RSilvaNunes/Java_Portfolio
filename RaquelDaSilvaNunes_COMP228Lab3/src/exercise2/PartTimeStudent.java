package exercise2;

public class PartTimeStudent extends Student {

    private int creditHour;

    //Constructor
    public PartTimeStudent(String firstName, String lastName, boolean status, int creditHour) {
        //Call to the Student superclass constructor
        super(firstName, lastName, status);

        //Limit the credit hours between 0 and 30 hours
        if(creditHour < 0 || creditHour > 30){
            throw new IllegalArgumentException("The number of credit hours must be greater than zero and less than 30.");
        }
        this.creditHour = creditHour;
    }

    //Get method for credit hour
    public int getCreditHour() {
        return creditHour;
    }

    //Set method for credit hour
    public void setCreditHour(int creditHour) {
        //Validate credit hour
        if(creditHour < 0 || creditHour > 30){
            throw new IllegalArgumentException("The number of credit hours must be greater than zero and less than 30.");
        }
        this.creditHour = creditHour;
    }

    //Implement getTuitionValue method
    @Override
    public double getTuitionValue(){
        return 100.00 * creditHour;
    }

    @Override
    public String toString(){
        return String.format("%s %nTuition value is: $%.2f%n", super.toString(), getTuitionValue());
    }
}

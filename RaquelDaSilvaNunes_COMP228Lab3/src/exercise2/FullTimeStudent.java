package exercise2;

public class FullTimeStudent extends Student {
    //Constructor
    public FullTimeStudent(String firstName, String lastName, boolean status) {
        //Call to the Student superclass constructor
        super(firstName, lastName, status);
    }

    //Implement getTuitionValue method
    @Override
    public double getTuitionValue(){
        return 2000.00;
    }

    @Override
    public String toString(){
        return String.format("%s %nTuition value is: $%.2f%n", super.toString(), getTuitionValue());
    }

}

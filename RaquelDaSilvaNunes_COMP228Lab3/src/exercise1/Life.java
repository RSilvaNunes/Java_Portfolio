package exercise1;

public class Life extends Insurance {
    //Constructor
    public Life(String typeOfInsurance, double monthlyCost){
        //Call to the Insurance superclass constructor
        super(typeOfInsurance, monthlyCost);
    }

    //Implement setInsuranceCost method
    @Override
    public double setInsuranceCost(){
        return getMonthlyCost();
    }

    //Implement displayInfo method
    @Override
    public String displayInfo(){
        return String.format("%s: %s%n%s: $%.2f", "Type of Insurance", getTypeOfInsurance(), "Monthly Cost", setInsuranceCost());
    }
}

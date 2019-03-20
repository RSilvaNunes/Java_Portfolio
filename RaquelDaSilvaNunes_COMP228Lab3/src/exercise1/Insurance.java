package exercise1;

public abstract class Insurance {
    //Instance variables of Insurance abstract class
    private String typeOfInsurance;
    private double monthlyCost;

    //Blank final instance variable assigned in a constructor
    public Insurance(String typeOfInsurance, double monthlyCost) {
        //Check if the monthly cost is higher than $0.00
        if(monthlyCost < 0.0){
            throw new IllegalArgumentException("Monthly insurance must me above $0.00.");
        }
        this.typeOfInsurance = typeOfInsurance;
        this.monthlyCost = monthlyCost;
    }

    //Implement get method for type of insurance
    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    //Implement get method for monthly cost
    public double getMonthlyCost() {
        return monthlyCost;
    }

    //Declare an abstract method to set insurance cost
    public abstract double setInsuranceCost();

    //Declare an abstract method to set display information
    public abstract String displayInfo();
}

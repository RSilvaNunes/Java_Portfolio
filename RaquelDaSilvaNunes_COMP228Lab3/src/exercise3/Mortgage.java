package exercise3;

public abstract class Mortgage implements MortgageConstants {
    //Instance variables of Mortgage abstract class
    private final int mortgageNumber;
    private final String customerFName;
    private final String customerLName;
    private double amountOfMortgage;
    private double interestRate;
    private int term;

    //Variables assigned to a constructor
    public Mortgage(int mortgageNumber, String customerFName, String customerLName, double amountOfMortgage, double interestRate, int term) {
        //Check if the amountOfMortgage is not over $300,000
        if(amountOfMortgage > 300000){
            throw new IllegalArgumentException("Mortgage amounts cannot be over $300,000.");
        }

        this.mortgageNumber = mortgageNumber;
        this.customerFName = customerFName;
        this.customerLName = customerLName;
        this.amountOfMortgage = amountOfMortgage;
        this.interestRate = interestRate;
        this.term = term;
    }

    //Implement all getters and setters (setters when applied)
    public int getMortgageNumber() {
        return mortgageNumber;
    }

    public String getCustomerFName() {
        return customerFName;
    }

    public String getCustomerLName() {
        return customerLName;
    }

    public double getAmountOfMortgage() {
        return amountOfMortgage;
    }

    public void setAmountOfMortgage(double amountOfMortgage) {
        //Check if the amountOfMortgage is not over $300,000
        if(amountOfMortgage > 300000){
            throw new IllegalArgumentException("Mortgage amounts cannot be over $300,000.");
        }

        this.amountOfMortgage = amountOfMortgage;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        if(getTerm() != 3 || getTerm() != 5){
            term = 1;
        }
        this.term = term;
    }

    @Override
    public void getShortTerm() {
        this.term = 1;
    }

    @Override
    public void getMediumTerm() {
        this.term = 3;
    }

    @Override
    public void getLongTerm() {
        this.term = 5;
    }

    @Override
    public String getBankName() {
        return "City Toronto";
    }

    @Override
    public void getMaxMortgageAmount() {
        //Check if the amountOfMortgage is not over $300,000
        if(amountOfMortgage > 300000){
            throw new IllegalArgumentException("Mortgage amounts cannot be over $300,000.");
        }

        this.amountOfMortgage = amountOfMortgage;
    }

    //Implement the getMortgageInfo method to display all mortgage data
    public String getMortgageInfo(){
        return String.format("Mortgage#: %d%nFirst Name: %s%nLast Name: %s%nAmount of Mortgage: $%.2f%nInterest Rate: %.2f%n" +
                "Mortgage Term: %d year(s)%n",getMortgageNumber(), getCustomerFName(), getCustomerLName(), getAmountOfMortgage(),
                getInterestRate(), getTerm());
    }
}

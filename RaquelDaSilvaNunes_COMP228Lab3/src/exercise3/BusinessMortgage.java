package exercise3;

public class BusinessMortgage extends Mortgage {

    public BusinessMortgage(int mortgageNumber, String customerFName, String customerLName, double amountOfMortgage, double interestRate, int term) {

        super(mortgageNumber, customerFName, customerLName, amountOfMortgage, interestRate, term);
    }

    @Override
    public void setAmountOfMortgage(double amountOfMortgage) {
        super.setAmountOfMortgage(amountOfMortgage);
    }

    @Override
    public void setInterestRate(double interestRate) {
        interestRate = interestRate + (interestRate * 0.01);
        super.setInterestRate(interestRate);
    }

    @Override
    public void getShortTerm() {
        super.getShortTerm();
    }

    @Override
    public void getMediumTerm() {
        super.getMediumTerm();
    }

    @Override
    public void getLongTerm() {
        super.getLongTerm();
    }

    @Override
    public String getBankName() {
        return super.getBankName();
    }

    @Override
    public void getMaxMortgageAmount() {
        super.getMaxMortgageAmount();
    }

    @Override
    public String getMortgageInfo() {
        return super.getMortgageInfo();
    }
}

package exercise3;

public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(int mortgageNumber, String customerFName, String customerLName, double amountOfMortgage, double interestRate, int term) {
        super(mortgageNumber, customerFName, customerLName, amountOfMortgage, interestRate, term);
        interestRate = interestRate + (interestRate * 0.02);
    }

    @Override
    public void setInterestRate(double interestRate) {
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

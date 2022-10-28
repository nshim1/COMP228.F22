package exercise3;

public class BusinessMortgage extends Mortgage {
    private double businessInterest = interestRate +0.01;
    public BusinessMortgage(int mortgageNum, String customerName, double amount, double interestRate, int term) {
        super(mortgageNum, customerName, amount, interestRate, checkTerm(term));
    }


}

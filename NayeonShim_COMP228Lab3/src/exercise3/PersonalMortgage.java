package exercise3;

public class PersonalMortgage extends Mortgage {
    private double personalInterest = interestRate +0.02;
    String type = "Mortgage";

    public PersonalMortgage(int mortgageNum, String customerName, double amount, double interestRate, int term) {
        super(mortgageNum, customerName, amount, interestRate, checkTerm(term));


    }

}

package exercise3;
import java.text.DecimalFormat;
public abstract class Mortgage implements MortgageConstants {
    /**
     * an abstract class that implements the MortgageConstants interface.
     * A Mortgage includes a mortgage number, customer name, amount of mortgage, interest rate, and term.
     **/

    protected int mortgageNum;
    protected String customerName;
    protected double amount;
    protected double interestRate;
    protected int term;
    static protected String type;

    DecimalFormat decimalFormat = new DecimalFormat("###.###");
    public Mortgage(int mortgageNum, String customerName, double amount, double interestRate, int term) {
        this.mortgageNum = mortgageNum;
        this.customerName = customerName;
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;

    }

    public void getMortageInfo() {
        System.out.println("#####################"+bankName+"##########################");
        System.out.println("Display information for mortgage number: " + mortgageNum);
        System.out.println("Mortgage Type: " + type);
        System.out.println("Customer name: " + customerName);
        System.out.println("Amount of mortgage: $" + decimalFormat.format(amount));
        System.out.println("Interest rate:" + interestRate * 100+ "%");
        System.out.println("Term (year): "+ term);
        System.out.println();
        System.out.println("Total amount owed: $ " + decimalFormat.format(amount* Math.pow((1 + interestRate), term)));
        System.out.println();
        System.out.println("############################################################");
        System.out.println();
    }
    public static boolean isValidAmount(double amount){
        return amount <= maxAmount;
    }
    protected static int checkTerm(int term) {
        if ( term == shortTerm || term == mediumTerm || term == longTerm ) {
            return term;
        } else return 1;
    }





}

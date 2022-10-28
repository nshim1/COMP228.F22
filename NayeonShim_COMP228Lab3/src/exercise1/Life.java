package exercise1;

public class Life extends Insurance{
    public Life() {
        super("Life");

    }

    @Override
    public void setInsuranceCost(double cost) {
        System.out.println("Set Insurance cost for Life Insurance");
        monthlyCost = cost;
    }
    @Override
    public void displayInfo() {
        System.out.println("Insurance type: " + getType() + '\n' + "monthlyCost: " + getMonthlyCost());
    }
}

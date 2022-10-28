package exercise1;

public class Health extends Insurance{
    public Health() {
        super("Health");
    }

    @Override
    public void setInsuranceCost(double cost) {
        System.out.println("Set Insurance cost for Health Insurance");
        monthlyCost = cost;
    }

    @Override
    public void displayInfo() {
        System.out.println("Insurance type: " + getType() + '\n' + "monthlyCost: " + getMonthlyCost());
    }
}

package exercise1;

public abstract class Insurance {
    private String type;
    protected double monthlyCost;

    protected Insurance(String type) {
        this.type = type;
    }

    protected String getType(){
        return type;
    }
    protected double getMonthlyCost(){
        return monthlyCost;
    }
    protected abstract void setInsuranceCost(double fee);
    protected abstract void displayInfo();

}

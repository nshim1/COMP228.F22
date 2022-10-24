package excercise1;

public class Life extends Insurance{
    @Override
    public double getInsuranceCost() {
        return getMonthlyCost();
    }

    @Override
    public String displayInfo() {
        return (super.toString());
    }
}

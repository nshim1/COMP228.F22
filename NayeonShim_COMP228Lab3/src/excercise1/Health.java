package excercise1;

public class Health extends Insurance{

    @Override
    public double getInsuranceCost() {
        return getMonthlyCost();
    }

    @Override
    public String displayInfo() {
        return (super.toString());
    }
}

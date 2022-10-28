package exercise2;

public class PartTimeGameTester extends GameTester {
    public PartTimeGameTester(String name) {
        super(name, false);
    }

    @Override
    protected int getSalary(int hours) {
        return hours*20;
    }
}

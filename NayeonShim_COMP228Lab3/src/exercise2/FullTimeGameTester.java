package exercise2;

public class FullTimeGameTester extends GameTester{
    public FullTimeGameTester(String name) {
        super(name, true);
    }

    @Override
    protected int getSalary(int hours) {

        return 3000;

    }
}

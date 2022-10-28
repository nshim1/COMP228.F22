package exercise2;

public abstract class GameTester {
    protected String name;
    protected boolean fullTimeStatus;

    public GameTester(String name, boolean status) {
        this.name = name;
        this.fullTimeStatus = status;
    }

    protected String getName(){
        return name;
    }
    protected boolean getStatus(){
        return fullTimeStatus;
    }
    protected abstract int getSalary(int hours);

}

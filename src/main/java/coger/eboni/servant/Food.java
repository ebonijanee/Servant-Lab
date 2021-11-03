package coger.eboni.servant;

public class Food {
    private String name;
    private Boolean isSafe;

    public Food(String name, boolean isSafe) {
        this.name=name;
        this.isSafe=isSafe;
    }

    public String getName() {
        return name;
    }

    public Boolean getSafe() {
        return isSafe;

    }
}
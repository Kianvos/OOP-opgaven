package practicum;

public class BasicPizza implements Pizza {

    @Override
    public double getPrice() {
        return 8.0;
    }

    @Override
    public String getDescription() {
        return "Pizza";
    }

}
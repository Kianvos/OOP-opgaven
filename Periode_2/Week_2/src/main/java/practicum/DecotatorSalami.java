package practicum;

public class DecotatorSalami extends PizzaDecorator{


    public DecotatorSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 2.50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Salami";
    }
}

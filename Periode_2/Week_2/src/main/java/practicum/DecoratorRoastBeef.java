package practicum;

public class DecoratorRoastBeef extends PizzaDecorator{
    public DecoratorRoastBeef(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Rosbief";
    }
}

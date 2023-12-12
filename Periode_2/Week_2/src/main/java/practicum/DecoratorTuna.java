package practicum;

public class DecoratorTuna extends PizzaDecorator{
    public DecoratorTuna(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Tonijn";
    }
}

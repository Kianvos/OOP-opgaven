package practicum;

public class DecoratorPineapple extends PizzaDecorator{
    public DecoratorPineapple(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double getPrice() {
        return pizza.getPrice() + 1;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Ananas";
    }
}

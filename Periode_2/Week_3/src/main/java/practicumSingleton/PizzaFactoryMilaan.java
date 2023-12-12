package practicumSingleton;

public class PizzaFactoryMilaan implements PizzaFactory {

    private static PizzaFactoryMilaan instance;
    private static double price;

    private PizzaFactoryMilaan() {
        price = 10;
    }

    public static PizzaFactoryMilaan getInstance() {
        if (instance == null) {
            return new PizzaFactoryMilaan();
        }
        return instance;
    }

    @Override
    public Pizza createPizza(String name) {
        return new Pizza() {
            @Override
            public double getPrice() {
                return price;
            }

            @Override
            public String getDescription() {
                return "Pizzaria Milaan pizza " + name;
            }
        };
    }
}

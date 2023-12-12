package practicumSingleton;
public class PizzaFactoryItalia implements PizzaFactory {

    private static PizzaFactoryItalia instance;
    private PizzaFactoryItalia() {

    }

    public static PizzaFactory getInstance(){
        if (instance == null){
            instance = new PizzaFactoryItalia();
        }
        return instance;
    }
    @Override
    public Pizza createPizza(String name) {
        return new Pizza() {
            @Override
            public double getPrice() {
                return 10;
            }

            @Override
            public String getDescription() {
                return "Pizzaria Italia pizza " + name;
            }
        };
    }
}

package opgaveFactory;


import practicum.Pizza;

public interface PizzaFactory {
    public Pizza createPizza(String name) throws Exception;
}

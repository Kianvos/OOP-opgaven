package opgaveFactory;

import practicum.*;

import java.util.Objects;

public class PizzaFactoryItalia implements PizzaFactory{
    @Override
    public Pizza createPizza(String name) throws Exception {
        Pizza pizza = null;
        Pizza basicPizza = new BasicPizza();
        if (Objects.equals(name, "Funghi")){
            pizza = new DecoratorMushrooms(basicPizza);
        } else if (Objects.equals(name, "Hawaii")){
            pizza = new DecoratorPineapple(new DecoratorHam(basicPizza));
        } else if (Objects.equals(name, "Samplice")){
            pizza = new DecoratorMushrooms(new DecoratorHam(basicPizza));
        }
        if (pizza == null){
            throw new Exception("Deze pizza is niet bekend");
        }
        return pizza;
    }
}

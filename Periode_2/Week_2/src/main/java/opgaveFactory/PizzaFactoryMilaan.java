package opgaveFactory;

import practicum.*;

import java.util.Objects;

public class PizzaFactoryMilaan implements PizzaFactory {
    @Override
    public Pizza createPizza(String name) throws Exception {
        Pizza pizza = null;
        Pizza basicPizza = new BasicPizza();
        if (Objects.equals(name, "Denna")) {
            pizza = new DecoratorMushrooms(new DecoratorHam(new DecotatorSalami(new DecoratorRoastBeef(basicPizza))));
        } else if (Objects.equals(name, "Samplice")) {
            pizza = new DecoratorMushrooms(new DecoratorHam(basicPizza));
        } else if (Objects.equals(name, "Sanremo")) {
            pizza = new DecoratorMushrooms(new DecotatorSalami(basicPizza));
        } else if (Objects.equals(name, "Al Tonno")) {
            pizza = new DecoratorTuna(new DecoratorOnions(basicPizza));
        }
        if (pizza == null) {
            throw new Exception("Deze pizza is niet bekend");
        }
        return pizza;
    }
}

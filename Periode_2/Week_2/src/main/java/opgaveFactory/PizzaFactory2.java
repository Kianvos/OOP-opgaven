package opgaveFactory;

import practicum.*;

public class PizzaFactory2 extends Factory {
    @Override
    public Pizza createPizzaFunghi() {
        return new DecoratorMushrooms(new BasicPizza());
    }

    @Override
    public Pizza createPizzaHawaii() {
        return new DecoratorPineapple(new DecoratorHam(new BasicPizza()));
    }

    @Override
    public Pizza createPizzaALTonno() {
        return new DecoratorPineapple(new DecoratorHam(new BasicPizza()));
    }
}

package practicum;

abstract public class PizzaDecorator implements Pizza {

    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

}

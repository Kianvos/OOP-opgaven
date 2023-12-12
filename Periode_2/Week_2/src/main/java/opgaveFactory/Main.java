package opgaveFactory;

import practicum.Pizza;

public class Main {
    public static void main(String[] args) {
//        PizzaFactory pizzaFactoryItalia = new PizzaFactoryItalia();
//        try {
//            Pizza pizzaHawaii = pizzaFactoryItalia.createPizza("Hawaii");
//            System.out.println(pizzaHawaii.getDescription()+", € "+ pizzaHawaii.getPrice());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        PizzaFactory2 pizzaFactory2 = new PizzaFactory2();
        Pizza pizzaFunghi = pizzaFactory2.createPizzaFunghi();
        System.out.println(pizzaFunghi.getDescription()+", € "+ pizzaFunghi.getPrice());
        Pizza pizzaHawaii = pizzaFactory2.createPizzaHawaii();
        System.out.println(pizzaHawaii.getDescription()+", € "+ pizzaHawaii.getPrice());
    }
}

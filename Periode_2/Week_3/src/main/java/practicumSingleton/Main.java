package practicumSingleton;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactoryItalia = PizzaFactoryItalia.getInstance();
        Pizza pizzaHawaii = pizzaFactoryItalia.createPizza("Hawaii");
        System.out.println(pizzaHawaii.getDescription()+", € "+ pizzaHawaii.getPrice());

        PizzaFactory pizzaFactoryMilaan = PizzaFactoryMilaan.getInstance();
        Pizza pizzaHawaii2 = pizzaFactoryMilaan.createPizza("Hawaii");
        System.out.println(pizzaHawaii2.getDescription()+", € "+ pizzaHawaii2.getPrice());
    }
}

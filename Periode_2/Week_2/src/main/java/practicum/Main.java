package practicum;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new BasicPizza();
        System.out.println(pizza1.getDescription()+", € "+ pizza1.getPrice());
        Pizza pizza2 = new DecoratorHam(new BasicPizza());
        System.out.println(pizza2.getDescription()+", € "+ pizza2.getPrice());
        Pizza pizza3 = new DecoratorMushrooms(new BasicPizza());
        System.out.println(pizza3.getDescription()+", € "+ pizza3.getPrice());
        Pizza pizza4 = new DecoratorHam(new DecoratorMushrooms(new BasicPizza()));
        System.out.println(pizza4.getDescription()+", € "+ pizza4.getPrice());
        Pizza pizza5 = new DecoratorHam(new DecoratorOnions(new DecotatorSalami(new DecotatorSalami(new BasicPizza()))));
        System.out.println(pizza5.getDescription()+", € "+ pizza5.getPrice());
    }
}

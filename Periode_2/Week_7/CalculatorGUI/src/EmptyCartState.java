import java.util.Scanner;

public class EmptyCartState implements State{

    ShoppingCart shoppingCart;

    public EmptyCartState(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voeg product toe.");
        System.out.println("1. Kaas");
        System.out.println("2. Ham");
        System.out.println("3. Oplader");
        Product cheese = new Product("Kaas", 2);
        Product ham = new Product("Ham", 3);
        Product charger = new Product("Oplader", 15);
        try {
            int amount = Integer.parseInt(scanner.nextLine());
            if (amount == 1){
                shoppingCart.stateAddProduct(cheese);
            } else if (amount == 2){
                shoppingCart.stateAddProduct(ham);
            } else {
                shoppingCart.stateAddProduct(charger);
            }
        } catch (NumberFormatException ignored) {
        }
    }

    @Override
    public void addProduct(Product product) {
        shoppingCart.addProduct(product);
        shoppingCart.setState(shoppingCart.getShoppingCartFilledState());
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("Dit kan niet aangezien er geen items in zitten.");
    }

    @Override
    public void emptyCart() {
        System.out.println("Je winkelwagen is al leeg.");
    }

    @Override
    public void pay(PaymentMethod paymentMethod) {
        System.out.println("Je moet eerst iets in je winkelwagen doen voordat je kan betalen.");
    }
}

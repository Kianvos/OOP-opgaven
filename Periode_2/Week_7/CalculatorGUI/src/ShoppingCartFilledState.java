import java.util.Scanner;

public class ShoppingCartFilledState implements State{

    ShoppingCart shoppingCart;

    public ShoppingCartFilledState(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0. Empty cart");
        System.out.println("1. Kaas");
        System.out.println("2. Ham");
        System.out.println("3. Oplader");
        System.out.println("4. Pay");
        Product cheese = new Product("Kaas", 2);
        Product ham = new Product("Ham", 3);
        Product charger = new Product("Oplader", 15);
        try {
            int amount = Integer.parseInt(scanner.nextLine());
            if (amount == 0){
                shoppingCart.stateEmptyCart();
            }
            if (amount == 1){
                shoppingCart.stateAddProduct(cheese);
            } else if (amount == 2){
                shoppingCart.stateAddProduct(ham);
            } else if (amount == 3){
                shoppingCart.stateAddProduct(charger);
            } else {
                System.out.println("1. Creditcard");
                System.out.println("2. Ideal");
                int paymentMethod = Integer.parseInt(scanner.nextLine());

                if (paymentMethod == 1){
                    CreditcardPayment creditcardPayment = new CreditcardPayment("Kian", "5555555555554444", "432", "24/07");
                    shoppingCart.statePay(creditcardPayment);
                } else {
                    IdealPayment idealPayment = new IdealPayment("0487ABNA050324", "Kian", "ABN AMRO", 323);
                    shoppingCart.statePay(idealPayment);
                }
            }
        } catch (NumberFormatException ignored) {
        }
    }

    @Override
    public void addProduct(Product product) {
        shoppingCart.addProduct(product);
    }

    @Override
    public void removeProduct(Product product) {
        shoppingCart.removeProduct(product);
        if (shoppingCart.isEmpty()){
            shoppingCart.setState(shoppingCart.getEmptyCartState());
        }
    }

    @Override
    public void emptyCart() {
        shoppingCart.emptyCart();
        shoppingCart.setState(shoppingCart.getEmptyCartState());
    }

    @Override
    public void pay(PaymentMethod paymentMethod) {
        shoppingCart.pay(paymentMethod);
        shoppingCart.setState(shoppingCart.getPaidState());
    }
}

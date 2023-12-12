public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product cheese = new Product("Kaas", 2);
        Product ham = new Product("Ham", 3);
        Product charger = new Product("Oplader", 15);

//        shoppingCart.stateAddProduct(charger);
//        shoppingCart.stateAddProduct(charger);
//
//        shoppingCart.statePay(creditcardPayment);
//        shoppingCart.statePay(idealPayment);

        while (true){
            shoppingCart.getAction();
        }

    }
}
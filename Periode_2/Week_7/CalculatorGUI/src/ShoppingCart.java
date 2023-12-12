import java.util.ArrayList;

public class ShoppingCart {
    private final State emptyCartState = new EmptyCartState(this);
    private final State shoppingCartFilledState = new ShoppingCartFilledState(this);
    private final State paidState = new PaidState();
    ArrayList<Product> products;
    private State state = emptyCartState;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void getAction(){
        state.getAction();
    }

    public void stateAddProduct(Product product){
        state.addProduct(product);
    }

    public void stateRemoveProduct(Product product){
        state.removeProduct(product);
    }

    public void stateEmptyCart(){
        state.emptyCart();
    }

    public void statePay(PaymentMethod paymentMethod){
        state.pay(paymentMethod);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void emptyCart(){
        products = new ArrayList<>();
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public boolean isEmpty(){
        return products.isEmpty();
    }

    public int totalPrice() {
        int sum = 0;
        for (Product product : products){
            sum += product.getPrice();
        }
        return sum;
    }

    public void pay(PaymentMethod paymentMethod) {
        int totalPrice = totalPrice();
        paymentMethod.pay(totalPrice);
    }

    public State getEmptyCartState() {
        return emptyCartState;
    }

    public State getShoppingCartFilledState() {
        return shoppingCartFilledState;
    }

    public State getPaidState() {
        return paidState;
    }
}

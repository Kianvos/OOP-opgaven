package opgave_one_state_pattern;


import java.util.ArrayList;

public class Order {

    ArrayList<Product> products = new ArrayList<>();

    private final State OpenOrderState = new OpenOrderState(this);
    private final State PaidOrderState = new PaidOrderState(this);
    private final State OrderSentState = new OrderSentState(this);

    private State state = OpenOrderState;

    public void payOrder() {
        state.payOrder();
    }

    public void sendOrder() {
        state.sendOrder();
    }

    public void returnOrder() {
        state.returnOrder();
    }

    public void refundOrder() {
        state.refundOrder();
    }

    //    Voegt product toe aan bestelling
    public void addProduct(String name, int price) {
        state.addProduct(name, price);
    }

    //Verwijdert product uit bestelling
    public void removeProduct(String name) {
        state.removeProduct(name);
    }

    public void addProductToOrder(String name, int price) {
        Product kaas = new Product(name, price);
        products.add(kaas);
    }

    public void removeProductToOrder(String name) {
        products.removeIf(product -> product.getName().equals(name));
    }

    //Retourneert totaal bedrag van de bestelling. Deze methode kan in elke toestand gebruikt worden.
    public void getAmount() {
        int amount = 0;
        for (Product product : products){
            amount += product.getPrice();
        }
        System.out.println(amount);
    }

    //Print op de console een overzicht van producten, aantallen en bedragen, het totaalbedrag, en de status: open order, paid order of sent order. Deze methode kan in elke toestand gebruikt worden.
    public void print() {
        for (Product product : products){
            System.out.println(product);
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getOpenOrderState() {
        return OpenOrderState;
    }

    public State getPaidOrderState() {
        return PaidOrderState;
    }

    public State getOrderSentState() {
        return OrderSentState;
    }

    public State getState() {
        return state;
    }
}

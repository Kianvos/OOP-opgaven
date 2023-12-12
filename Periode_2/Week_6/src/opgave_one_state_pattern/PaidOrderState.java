package opgave_one_state_pattern;

public class PaidOrderState implements State{

    private Order order;

    public PaidOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Je hebt al betaald");
    }

    @Override
    public void sendOrder() {
        System.out.println("Order wordt verzonden.");
        order.setState(order.getOrderSentState());
    }

    @Override
    public void returnOrder() {
        System.out.println("Bestelling is nog niet verzonden.");
    }

    @Override
    public void refundOrder() {
        System.out.println("Order geannuleerd en geld terug.");
        order.setState(order.getOpenOrderState());
    }

    @Override
    public void addProduct(String name, int price) {
        System.out.println("Je kan je order niet aanpassen na betaling.");
    }

    @Override
    public void removeProduct(String name) {
        System.out.println("Je kan je order niet aanpassen na betaling.");
    }
}

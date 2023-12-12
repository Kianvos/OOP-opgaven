package opgave_one_state_pattern;

public class OrderSentState implements State{
    private Order order;

    public OrderSentState(Order order) {
        this.order = order;
    }
    @Override
    public void payOrder() {
        System.out.println("Je hebt al betaald");
    }

    @Override
    public void sendOrder() {
        System.out.println("Order is al verzonden.");
    }

    @Override
    public void returnOrder() {
        System.out.println("Order wordt teruggestuurd. Je kan je geld terugkrijgen als het pakket bij ons binnen is.");
        order.setState(order.getPaidOrderState());
    }

    @Override
    public void refundOrder() {
        System.out.println("Order is nog niet weer bij ons binnen.");
    }

    @Override
    public void addProduct(String name, int price) {
        System.out.println("Je kan je order niet aanpassen nadat het verzonden is.");
    }

    @Override
    public void removeProduct(String name) {
        System.out.println("Je kan je order niet aanpassen nadat het verzonden is.");
    }
}

package opgave_one_state_pattern;

public class OpenOrderState implements State {
    private Order order;

    public OpenOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Betaald");
        order.setState(order.getPaidOrderState());
    }

    @Override
    public void sendOrder() {
        System.out.println("Dit kan nog niet");
    }

    @Override
    public void returnOrder() {
        System.out.println("Zolang je niks besteld hebt is dit niet mogelijk.");
    }

    @Override
    public void refundOrder() {
        System.out.println("Zolang je niks besteld hebt is dit niet mogelijk.");
    }

    @Override
    public void addProduct(String name, int price) {
        order.addProductToOrder(name, price);
    }

    @Override
    public void removeProduct(String name) {
        order.removeProductToOrder(name);
    }
}

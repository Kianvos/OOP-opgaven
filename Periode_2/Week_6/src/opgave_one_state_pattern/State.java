package opgave_one_state_pattern;

public interface State {
    void payOrder();

    void sendOrder();

    void returnOrder();

    void refundOrder();

    void addProduct(String name, int price);
    void removeProduct(String name);
}

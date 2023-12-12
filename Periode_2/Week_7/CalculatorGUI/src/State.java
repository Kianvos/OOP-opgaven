public interface State {
    void getAction();
    void addProduct(Product product);
    void removeProduct(Product product);
    void emptyCart();
    void pay(PaymentMethod paymentMethod);

}

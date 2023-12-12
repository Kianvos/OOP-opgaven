public class PaidState implements State{
    @Override
    public void getAction() {

    }

    @Override
    public void addProduct(Product product) {
        System.out.println("Je kan aan een afgeronde order niets toevoegen.");
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("Je kan aan een afgeronde order niets verwijderen.");
    }

    @Override
    public void emptyCart() {
        System.out.println("Je kan je winkelwagen niet legen na een bestelling.");
    }

    @Override
    public void pay(PaymentMethod paymentMethod) {
        System.out.println("Je hebt al betaald.");
    }
}

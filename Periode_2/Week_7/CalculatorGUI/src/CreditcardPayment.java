public class CreditcardPayment implements PaymentMethod {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditcardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Betaald met creditcard " + " Kost: " + amount);
    }
}

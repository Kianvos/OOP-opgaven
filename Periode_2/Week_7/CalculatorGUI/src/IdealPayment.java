public class IdealPayment implements PaymentMethod{

    private String acountNumber;
    private String name;
    private String bankName;
    private int cardNumber;
    private int pincode;

    public IdealPayment(String acountNumber, String name, String bankName, int cardNumber) {
        this.acountNumber = acountNumber;
        this.name = name;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.pincode = 1884;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Betaald door " + name + " Kost: " + amount);
    }
}

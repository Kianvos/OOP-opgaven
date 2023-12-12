package practicum_state;

public class ATMEmpty implements State {
    private ATM atm;

    public ATMEmpty(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void getAction() {
        System.out.println("Geen geld in de ATM");
    }

    @Override
    public void ATMEmpty() {

    }

    @Override
    public void insertCard() {
        System.out.println("Geen geld in de ATM");
    }

    @Override
    public void enterPincode(String pin) {
        System.out.println("Geen geld in de ATM");
    }

    @Override
    public void enterAmount(int amount) {
        System.out.println("Geen geld in de ATM");
    }

    @Override
    public void takeMoney() {
        System.out.println("Geen geld in de ATM");
    }

    @Override
    public void cancel() {

    }
}

package practicum_state;

import java.util.Scanner;

public class PincodeEnteredState implements State {

    private ATM atm;

    @Override
    public void getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toets het bedrag in:");
        try {
            int amount = Integer.parseInt(scanner.nextLine());
            atm.enterAmount(amount);
        } catch (NumberFormatException ignored) {
        }
    }

    @Override
    public void ATMEmpty() {
        System.out.println("Geen geld in de ATM");
    }

    public PincodeEnteredState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Cannot enter pincode.");
    }

    @Override
    public void enterPincode(String pin) {
        System.out.println("Kan geen pincode meer invoeren");
    }

    @Override
    public void enterAmount(int amount) {
        if (amount > 0) {
            if (amount > atm.getBalance()) {
                System.out.println("Niet genoeg geld in de ATM");
            } else {
                System.out.println("EUR " + amount + " is delivered. Please take your money and card.");
                atm.removeMoney(amount);
                atm.setState(atm.getMoneyDeliveredState());
            }
        }
    }

    @Override
    public void takeMoney() {
        System.out.println("Cannot enter pincode.");
    }

    @Override
    public void cancel() {
        System.out.println("Je hebt je transactie geannuleerd");
        atm.setState(atm.getWaitingForCardState());
    }
}

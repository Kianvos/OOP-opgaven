package practicum_state;

import java.util.Scanner;

public class CardInsertedState implements State {

    public CardInsertedState(ATM atm) {
        this.atm = atm;
    }


    @Override
    public void getAction() {
        System.out.println("Voer uw pincode in: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        atm.enterPincode(s);
    }

    @Override
    public void ATMEmpty() {
        System.out.println("Geen geld in de ATM");
    }

    private ATM atm;
    private Card card = new Card("5555");

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPincode(String pin) {
        if (card.checkPincode(pin)) {
            System.out.println("Pincode correct");
            atm.setState(atm.getPincodeEnteredState());
        } else {
            System.out.println("Incorrect pincode");
        }
    }

    @Override
    public void enterAmount(int amount) {
        System.out.println("Cannot enter amount.");
    }

    @Override
    public void takeMoney() {
        System.out.println("No money.");
    }

    @Override
    public void cancel() {
        System.out.println("Je hebt je transactie geannuleerd");
        atm.setState(atm.getWaitingForCardState());
    }
}
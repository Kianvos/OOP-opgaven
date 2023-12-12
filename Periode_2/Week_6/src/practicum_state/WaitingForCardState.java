package practicum_state;

import java.util.Scanner;

public class WaitingForCardState implements State {

    private ATM atm;

    public WaitingForCardState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void getAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Druk op 'I' om kaart in te laden");
        String s = scanner.nextLine().trim();
        if (s.equals("I")){
            atm.insertCard();
        }
    }

    @Override
    public void ATMEmpty() {
        System.out.println("Geen geld in de ATM");
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted.");
        atm.setState(atm.getCardInsertedState());
    }

    @Override
    public void enterPincode(String pin) {
        System.out.println("Cannot enter pincode.");
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
        System.out.println("Eerst kaart erin doen, dan pas annuleren.");
    }
}

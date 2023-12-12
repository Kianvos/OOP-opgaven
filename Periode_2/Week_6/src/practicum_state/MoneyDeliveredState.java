package practicum_state;

import java.util.Scanner;

public class MoneyDeliveredState implements State{

    private ATM atm;

    public MoneyDeliveredState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Druk op 'I' om het geld te pakken.");
        String s = scanner.nextLine().trim();
        if (s.equals("I")){
            atm.takeMoney();
        }
    }

    @Override
    public void ATMEmpty() {
        System.out.println("Geen geld in de ATM");
    }

    @Override
    public void insertCard() {
        System.out.println("Geen geld");
    }

    @Override
    public void enterPincode(String pin) {
        System.out.println("Geen geld");
    }

    @Override
    public void enterAmount(int amount) {
        System.out.println("Geen geld");
    }

    @Override
    public void takeMoney() {
        System.out.println("Money and card taken. Good bye!");
        if (atm.getBalance() == 0){
            atm.setState(atm.getATMEmpty());
        }else {
            atm.setState(atm.getWaitingForCardState());
        }
    }

    @Override
    public void cancel() {
        System.out.println("Pak je geld, annuleren kan niet meer.");
    }
}

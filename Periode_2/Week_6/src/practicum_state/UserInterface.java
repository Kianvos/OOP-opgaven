package practicum_state;

import java.util.Scanner;

public class UserInterface {
    private ATM atm;

    public UserInterface(ATM atm) {
        this.atm = atm;
    }

    public void start() {

        while (true){
            atm.getAction();
        }
    }
}

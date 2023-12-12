package practicum_state;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        UserInterface userInterface = new UserInterface(atm);
        userInterface.start();
    }
}
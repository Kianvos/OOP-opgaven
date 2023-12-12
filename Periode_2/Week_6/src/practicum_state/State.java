package practicum_state;

public interface State {

    void getAction();
    void ATMEmpty();
    void insertCard();
    void enterPincode(String pin);
    void enterAmount(int amount);
    void takeMoney();

    void cancel();

}

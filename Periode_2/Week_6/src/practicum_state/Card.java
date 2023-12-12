package practicum_state;

public class Card {
    private String pincode;

    public Card(String pincode) {
        this.pincode = pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Boolean checkPincode(String pin) {
        if (pin.equals(pincode)) {
            return true;
        } else {
            return false;
        }
    }
}

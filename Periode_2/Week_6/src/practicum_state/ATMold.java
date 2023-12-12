package practicum_state;

public class ATMold {

    public static final int STATE_WAITING_FOR_CARD = 1;
    public static final int STATE_CART_INSERTED = 2;
    public static final int STATE_PINCODE_ENTERED = 3;
    public static final int STATE_MONEY_DELIVERED = 4;

    private int state = STATE_WAITING_FOR_CARD;

    // Publieke methodes

    public void insertCard() {
        if (state==STATE_WAITING_FOR_CARD) {
            System.out.println("Card inserted.");
            state=STATE_CART_INSERTED;
        } else {
            System.out.println("Card already inserted.");
        }
    }

    public void enterPincode(String pin) {
        if (state==STATE_CART_INSERTED) {
            if (pin.equals("1234")) {
                System.out.println("Pincode correct");
                state=STATE_PINCODE_ENTERED;
            } else {
                System.out.println("Incorrect pincode");
            }
        } else {
            System.out.println("Cannot enter pincode.");
        }
    }

    public void enterAmount(int amount) {
        if (state==STATE_PINCODE_ENTERED) {
            if (amount>0) {
                System.out.println("EUR "+amount+" is delivered. Please take your money and card.");
                state=STATE_MONEY_DELIVERED;
            }
        } else {
            System.out.println("Cannot enter amount.");
        }
    }

    public void takeMoney() {
        if (state==STATE_MONEY_DELIVERED) {
            System.out.println("Money and card taken. Good bye!");
            state=STATE_WAITING_FOR_CARD;
        } else {
            System.out.println("No money.");
        }
    }

}
public class Account {
    public static void main(String[] args) {
        Account henk = new Account("Henk");
        Account ruud = new Account("Ruud");
        henk.deposit(50);
        System.out.println(henk);
        if (henk.equalBalance(ruud)){
            System.out.println("Gelijk");
        }
    }
    private String name;
    private static double balance;

    public Account(String name) {
        this.name = name;
        balance = 0.0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean equalBalance(Account that) {
        return balance == that.getBalance();
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return String.format("%s's balance: %.02f", name, balance);
    }
}
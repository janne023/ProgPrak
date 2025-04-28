package Exercise1;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public Account(String owner, int pin, double balance, String internalNote) {
        this.owner = owner;
        this.pin = pin;
        this.balance = balance;
        this.internalNote = internalNote;

    }
    public double getBalance() {
        return balance;
    }
    public boolean changePin(int oldPin, int newPin) {
        if (this.pin == oldPin) {
            this.pin = newPin;
            return true;
        } else {
            return false;
        }
    }
}

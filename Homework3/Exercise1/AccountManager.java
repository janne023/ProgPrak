package Exercise1;

public class AccountManager {
    public void testAccess() {
        Account acc = new Account("John", 1000, 1234, "Note");

        System.out.println(acc.owner);
        System.out.println(acc.internalNote);
        System.out.println(acc.pin);
        // System.out.println(acc.balance);     // private → kein Zugriff direkt möglich
        System.out.println(acc.getBalance());   // Zugriff über Getter möglich
    }


    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        manager.testAccess();
    }
}


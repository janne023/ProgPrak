package Exercise1_1;


import Exercise1.Account;

public class ExternalAudit {
    public void testAccess(){
        Account acc = new Account("John", 2000,4567,"Confidential");
        System.out.println(acc.owner);
        // System.out.println(acc.internalNote); //  default/package-private → Zugriff NICHT erlaubt
        // System.out.println(acc.pin);           // protected → Zugriff NICHT erlaubt (nur über Vererbung oder Paket)
        // System.out.println(acc.balance);       // private → Zugriff NICHT erlaubt
        System.out.println(acc.getBalance());
    }
    public static void main(String[] args) {
        ExternalAudit audit = new ExternalAudit();
        audit.testAccess();
    }
}

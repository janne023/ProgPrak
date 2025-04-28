package Exercise1_2;

import Exercise1.Account;

public class CompanyAccount extends Account {
    public CompanyAccount(String owner, int pin, double balance, String InternalNote) {
        super(owner , pin ,balance, InternalNote);
    }
    public void testAccess(){
        System.out.println(owner);
        //System.out.println(internalNote);
        System.out.println(pin);
        // System.out.println(balance);
        System.out.println(getBalance());
    }
    public static void main(String[] args) {
        CompanyAccount ca = new CompanyAccount("John", 1234,1000,"interne Notiz");
        ca.testAccess();
    }
}

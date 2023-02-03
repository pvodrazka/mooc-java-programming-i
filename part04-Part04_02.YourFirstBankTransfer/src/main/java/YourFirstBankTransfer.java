
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthews = new Account("Matthews account", 1000);
        Account muj = new Account("My account", 0);
        matthews.withdrawal(100);
        muj.deposit(100);
        System.out.println(matthews);
        System.out.println(muj);

    }
}

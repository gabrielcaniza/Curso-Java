import Entities.Account;
import Entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        Account x = new Account(1020, "alex", 1000.0);
        Account y = new SavingsAccount(1023, "MARIA", 1000.0, 0.01);

        x.Withdraw(50.0);
        y.Withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
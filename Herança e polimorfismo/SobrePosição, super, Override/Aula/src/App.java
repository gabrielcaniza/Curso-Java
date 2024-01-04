import Entities.Account;
import Entities.BusinesAccount;
import Entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Account acc1 = new Account(1001, "alex", 1000.0);
        acc1.Withdraw(200.0);
        System.err.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "alex", 1000.0, 0.01);
        acc2.Withdraw(200);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinesAccount(1003, "bob", 1000.0, 500);

        acc3.Withdraw(200.0);

        System.out.println(acc3.getBalance());

    }
}

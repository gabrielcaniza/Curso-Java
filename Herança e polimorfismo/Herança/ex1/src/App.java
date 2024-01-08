import Entities.Account;
import Entities.BussinessAccount;
import Entities.SavingAccount;

public class App {
    public static void main(String[] args) throws Exception {

        Account acc = new Account(1001, "ALex", 0.0);
        BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingAccount(1004, "Ana", 0.0, 0.10);

        // DOWNCASTING
        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(100.0);

        // BussinessAccount acc5 = (BussinessAccount) acc3;
        if (acc3 instanceof BussinessAccount) {
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(200);
            System.out.println("loan");
        }

        if (acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalance();
            System.out.println("update!");
        }
    }
}

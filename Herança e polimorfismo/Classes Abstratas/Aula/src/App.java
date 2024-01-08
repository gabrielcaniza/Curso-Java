import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1002, "alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "bob", 500.0, 0.01));
        list.add(new BusinessAccount(1004, "ana", 1000.0, 400.0));

        double sum = 0.0;

        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for(Account acc: list){
            acc.deposit(10.0);
        }

        for(Account acc : list){
            System.out.printf("updated for account %d: %.2f%n " , acc.getNumber(), acc.getBalance());
        }

    }
}

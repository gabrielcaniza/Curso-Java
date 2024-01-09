package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.account;
import model.exceptions.BusinessException;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = sc.nextDouble();

        account acc = new account(number, holder, balance, withdrawLimit);

        System.out.println();

        System.out.print("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();


        //Usamos o metodo withdraw pra delegar a excessã
        try {
            acc.withdraw(amount);//chama o withdraw e a execução vai para a classe account.
            System.out.printf("Novo saldo %.2f", acc.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

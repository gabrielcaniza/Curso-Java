import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double cotacao = sc.nextDouble();

        System.out.println("Enter the amount in dollars to be converted:");
        double dollar = sc.nextDouble();

        // Chamando o método currencyConverter da classe Utility
        double amountInReais = Utility.currencyConverter(dollar, cotacao);

        System.out.println("Amount in reais to be paid: R$ " + amountInReais);

        sc.close();
    }
}
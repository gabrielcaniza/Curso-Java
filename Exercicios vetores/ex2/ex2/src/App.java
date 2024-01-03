import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int vect[] = new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt();
        }

        System.out.print("VALORES = ");

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("%d  ", vect[i]);
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        System.out.println("soma = " + sum);

        double media = sum / vect.length;
        System.out.println("A Media é " + media);

        sc.close();

    }
}

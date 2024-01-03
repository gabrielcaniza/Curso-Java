import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int vect[] = new int[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }

            sc.close();
        }
    }
}
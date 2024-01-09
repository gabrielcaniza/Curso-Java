import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try { // Botamos o bloco de comando a ser executado
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
            // No catch botamos as excessões, os "Erros" e
            // uma mensagem pro usuario informando.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invvalid position!");
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }

        System.out.println("End of program");

        sc.close();
    }
}

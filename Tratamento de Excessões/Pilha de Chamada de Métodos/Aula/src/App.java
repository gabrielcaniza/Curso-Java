import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        method1();
        System.out.println("End of program");
    }

    public static void method1() {
        System.out.println("--------METHOD 1 START----------");

        method2();

        System.out.println("--------METHOD 1 END----------");

    }

    public static void method2() {
        System.out.println("--------METHOD 2 START----------");
        Scanner sc = new Scanner(System.in);

        try { // Botamos o bloco de comando a ser executado
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
            // No catch botamos as excessões, os "Erros" e
            // uma mensagem pro usuario informando.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invvalid position!");
            e.printStackTrace(); //Imprime na tela o rastreamento
            //do stack
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }

        sc.close();
        System.out.println("-----------Method 2 End------------");

    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Rent vect[] = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("email : ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            vect[roomNumber] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy Rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();

    }
}

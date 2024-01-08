import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employe;
import Entities.OutsourceEmploye;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employe> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.println("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.println("additionalCharge: ");
                double additionalCharge = sc.nextDouble();
                Employe emp = new OutsourceEmploye(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            } else {
                Employe emp = new Employe(name, hours, valuePerHour);
                list.add(emp);
            }

        }

        System.out.println();
        System.out.println("PAYMENTS");
        for (Employe emp : list) {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}

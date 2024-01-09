import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.reservation;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date(dd/MM/yyyy)");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date(dd/MM/yyyy)");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date mus be after check=in date");

        } else {

            reservation reservation = new reservation(number, checkIn, checkOut);
            System.err.println("reservation: " + reservation);
            System.out.println();
            System.out.print("Enther data to update the reservation:");
            System.out.println("Check-in date(dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date(dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

        }
        sc.close();
    }
}

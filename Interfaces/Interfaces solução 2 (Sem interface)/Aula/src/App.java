import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Model.Entities.CarRental;
import Model.Entities.Vehicle;
import Model.Services.BrazilTaxService;
import Model.Services.RentalService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy  hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Retorno dd/MM/yyyy  hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre  com o preço por hora: ");
        double pricePerHour= sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay=sc.nextDouble();
        RentalService rentalService= new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);
        System.out.println("FAtura: ");
        System.out.println("Pagamento básico: " +cr.getInvoice().getBasicPayment());
        System.out.println("Imposto " + cr.getInvoice().getTax());
System.out.println("Pagamento total:" + cr.getInvoice().getTotalPayment() );


        sc.close();
    }
}

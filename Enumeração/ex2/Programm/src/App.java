import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new Departament(departmentName));
        System.out.println("How many contracts for this worker? ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.err.println("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (Hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate incoome (MM//YYYY): ");
        String montAndYear = sc.next();
        int month = Integer.parseInt(montAndYear.substring(0, 2));
        int year = Integer.parseInt(montAndYear.substring(3));
        System.out.println("Name " + worker.getName());
        System.out.println("Department " + worker.getDepartament().getName());
        System.out.println("income for " + montAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        sc.close();
    }
}
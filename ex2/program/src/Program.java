import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Dados dados = new Dados();

        dados.Name = sc.nextLine();
        System.out.println("Name: " + dados.Name);
        dados.GrossSalary = sc.nextDouble();
        System.out.print("Gross Salary:" + dados.GrossSalary);
        dados.Tax = sc.nextDouble();
        System.out.println("Tax: " + dados.Tax);
        System.out.println("Employee: " + dados.Name + ", $" + dados.NetSalary());
        
        double increase = sc.nextDouble();
    
        double newNetSalary = dados.NetSalary() + increase;
        dados.IncreaseSalary(increase);

        System.out.println("Updated data: " + dados.Name + ", $ " + newNetSalary);

        sc.close();
    }
}
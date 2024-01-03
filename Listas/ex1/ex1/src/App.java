import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funcionários serão registrados?");
        int n = sc.nextInt();
        sc.nextLine(); // Consumir o caractere de nova linha

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consumir o caractere de nova linha
            System.out.print("Nome:");
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.print("Informe o ID do funcionário que terá aumento de salário: ");
        int idsalary = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("Este ID não existe!");
        } else {
            System.out.print("Informe a porcentagem de aumento: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("Lista de funcionários:");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        sc.close();
    }
}


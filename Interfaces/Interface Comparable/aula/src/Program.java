
import entities.Employee;

public class Program {
    public static void main(String[] args) {

        Employee a = new Employee("maria", 2522.2);
        Employee b = new Employee("maria", 2522.2);

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}
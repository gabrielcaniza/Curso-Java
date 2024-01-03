import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Digite seu Nome:");
        student.Name=sc.nextLine();

        System.out.println("Digite sua Primeira Nota:");
        student.n1 = sc.nextDouble();

        System.out.println("Digite sua Segunda Nota:");
        student.n2 = sc.nextDouble();

        System.out.println("Digite sua Terceira Nota:");
        student.n3 = sc.nextDouble();

        System.out.println("Final Grade: " + student.media());
        student.VerificarMedia();

        sc.close();
    }
}
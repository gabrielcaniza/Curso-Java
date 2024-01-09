import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        File file = new File("C:\\windows\\temp\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            // Realize as operações de leitura aqui
            System.out.println("Operações de leitura aqui");
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
            // Trate a exceção aqui, se necessário
        } finally {
            // Certifique-se de fechar o Scanner, se estiver aberto
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block");
        }
    }
}

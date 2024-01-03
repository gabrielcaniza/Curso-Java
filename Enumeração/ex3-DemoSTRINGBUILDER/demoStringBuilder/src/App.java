import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Formatando data e hora
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome! ");
        // parse instancia a data e hora
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelling to Zealand",
                "I'm going to visiti this wonderful country!", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        sc.close();
    }
}

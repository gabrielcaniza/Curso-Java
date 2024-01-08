import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Enums.Colors;
import entities.Circle;
import entities.Retangule;
import entities.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        System.out.print("Enther the number of shapes:");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Shape #" + i + " Data");
            System.out.print("Retctangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Colors color = Colors.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();

                System.out.print("height: ");
                Double height = sc.nextDouble();
                list.add(new Retangule(color, width, height));

            } else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }

            System.out.println();
            System.out.println("Shape areas: ");

            for (Shape shape : list) {
                System.out.println(String.format("%.2f", shape.area()));
            }
        }

        sc.close();

    }
}

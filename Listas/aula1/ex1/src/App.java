import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<>();

        list.add("MARIA");
        list.add("ALEX");
        list.add("BOB");
        list.add("ANNA");
        list.add(1, "jose");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------");

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------");

        System.out.println("Index of Bob: " + list.indexOf("BOB"));
        System.out.println("-------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'z').findFirst().orElse(null);
        System.out.println(name);
    }
}

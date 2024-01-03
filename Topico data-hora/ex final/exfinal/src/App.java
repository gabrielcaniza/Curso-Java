import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate d04 = LocalDate.parse("2023-12-20");
        LocalDateTime d05 = LocalDateTime.parse("2023-12-20T01:30:26");
        Instant d06 = Instant.parse("2023-12-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("PastWeekLocalDate" + "=" + pastWeekLocalDate);
        System.out.println("NextWeekLocalDate" + "=" + nextWeekLocalDate);
    }
}

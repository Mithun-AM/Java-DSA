import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate birthday = LocalDate.of(2000, Month.JUNE, 15);
        System.out.println("Birthday: " + birthday);

        System.out.println("Tomorrow: " + today.plusDays(1));
        System.out.println("Last week: " + today.minusWeeks(1));
        System.out.println("Last week: " + today.getDayOfYear());


        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        LocalTime time = LocalTime.of(14, 30);
        System.out.println("Set time: " + time);

        System.out.println("Plus 2 hours: " + now.plusHours(2));


        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current DateTime: " + current);

        // Formatting
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatted = current.format(format);
        System.out.println("Formatted: " + formatted);

        // Parsing
        String dateStr = "27-05-2025 18:30";
        LocalDateTime parsed = LocalDateTime.parse(dateStr, format);
        System.out.println("Parsed: " + parsed);


        LocalDate start = LocalDate.of(2024, 1, 1);
        LocalDate end = LocalDate.of(2025, 5, 27);

        long days = ChronoUnit.DAYS.between(start, end);
        System.out.println("Days between: " + days);
    }
}

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter DT = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss");
        LocalDateTime LDT = LocalDateTime.now();
        System.out.println(LDT.format(DT));
    }
}
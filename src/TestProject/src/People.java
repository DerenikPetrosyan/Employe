import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

import static java.time.temporal.ChronoField.DAY_OF_WEEK;
import static java.time.temporal.ChronoField.DAY_OF_YEAR;

public class People {
    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.now();
        System.out.println(a.getDayOfMonth());
        System.out.println(a.getMonth());
        System.out.println(a.getYear());

        String f1=String.format("|%10d|", 101);


    }

}

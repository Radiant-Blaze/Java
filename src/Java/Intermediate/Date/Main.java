package Java.Intermediate.Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        // Current date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // Current time
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // Current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // UTC timestamp
        Instant instant = Instant.now();
        System.out.println(instant);

        // Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // Comparing dates & times
        LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0); // CHRISTMAS
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0); // NEW YEARS DAY

        if(date1.isBefore(date2)){
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1 + " is later than " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}
package pl.camp.it.daty;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*Date date = new Date();

        System.out.println(date);*/

        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant2 = Instant.now();

        Duration przedzialCzasu = Duration.between(instant, instant2);
        System.out.println(przedzialCzasu);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        LocalTime customTime = LocalTime.of(15, 35, 58);
        System.out.println(customTime);

        LocalDate customDate = LocalDate.of(2020, 12, 28);
        System.out.println(customDate);

        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(instant, ZoneId.of("America/Phoenix"));

        System.out.println(zonedDateTime2);

        LocalDateTime data = LocalDateTime.of(
                LocalDate.of(2010, 10, 10),
                LocalTime.of(15, 15, 15)
                );

        System.out.println(data);

        ZonedDateTime zonedDateTime3 = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2000, 10, 14),
                        LocalTime.of(13,12,31)
                ),
                ZoneId.of("Europe/Warsaw")
        );

        System.out.println(zonedDateTime3);

        ZonedDateTime zonedDateTime4 = ZonedDateTime.ofInstant(zonedDateTime3.toInstant(), ZoneId.of("Australia/Darwin"));

        System.out.println(zonedDateTime4);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:dd:MM");

        LocalDate dataLokalna = LocalDate.parse("2020:11:12", formatter);

        System.out.println(dataLokalna);

        String dataString = dataLokalna.format(formatter);

        System.out.println(dataString);



    }
}

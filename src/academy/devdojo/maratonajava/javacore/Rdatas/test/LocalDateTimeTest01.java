package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2022,2,13,23,32,11);
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("23:45:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        System.out.println("-------------------");
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println("-------------------");
        System.out.println(ldt1);
        System.out.println(ldt2);


    }
}

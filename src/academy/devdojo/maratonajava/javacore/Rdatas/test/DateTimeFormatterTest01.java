package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        //Formate transformando de um objeto para string
        //Parse de uma string para um objeto
        LocalDate date = LocalDate.now();
        String format = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = date.format(DateTimeFormatter.ISO_DATE);
        String format3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);
        System.out.println(format2);
        System.out.println(format3);
        LocalDate parse = LocalDate.parse("20260302", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2026-03-02", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-03-02", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String format4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-03-02T18:46:04.1121294");
        System.out.println(parse4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("2026-03-02", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
    }
}

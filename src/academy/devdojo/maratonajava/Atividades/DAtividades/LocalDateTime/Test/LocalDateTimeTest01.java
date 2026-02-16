package academy.devdojo.maratonajava.Atividades.DAtividades.LocalDateTime.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime agendamento = LocalDateTime.of(2026, Month.MARCH,15,14,30);
        LocalDate date = agendamento.toLocalDate();
        LocalTime time = agendamento.toLocalTime();
        System.out.println("Data: " + date);
        System.out.println("Horario: " + time);
        System.out.println(agendamento.plusHours(2));
        System.out.println(agendamento.plusDays(5));
    }
}

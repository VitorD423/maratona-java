package academy.devdojo.maratonajava.Atividades.DAtividades.LocalDateTime.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;


public class LocalDateTimeTest03 {
    public static void main(String[] args) {
        LocalDateTime inicio = LocalDateTime.of(2026, 3,13,5,12,12);
        LocalDateTime fim = LocalDateTime.of(2026,3,14,10,6);

        Duration duration = Duration.between(inicio,fim);
        Period period = Period.between(inicio.toLocalDate(),fim.toLocalDate());

        System.out.println("Duração real: " + duration.toHours() + " Horas");
        System.out.println("Duração em calendário " +period.getDays() + " dia");


    }
}

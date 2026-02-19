package academy.devdojo.maratonajava.Atividades.DAtividades.LocalDateTime.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest04 {
    public static void main(String[] args) {
        LocalDateTime checkIn = LocalDateTime.now();
        LocalDateTime checkOut = LocalDateTime.now().plusDays(1).plusHours(1);

        Period period = Period.between(checkIn.toLocalDate(),checkOut.toLocalDate());
        Duration duration = Duration.between(checkIn,checkOut);
        long noites = ChronoUnit.DAYS.between(checkIn,checkOut);
        double tempo = duration.toMinutes();
        if ((noites > 0) && (tempo > 0)) {
            System.out.println("Paga uma diaria");
        }

    }
}

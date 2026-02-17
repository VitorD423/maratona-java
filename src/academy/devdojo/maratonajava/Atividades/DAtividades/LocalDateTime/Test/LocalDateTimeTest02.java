package academy.devdojo.maratonajava.Atividades.DAtividades.LocalDateTime.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeTest02 {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime soma = agora.plusDays(1).plusHours(3);



       if (soma.isAfter(agora)){
            System.out.println("Acontece depois de agora");

           Duration duracao = Duration.between(agora,soma);

           System.out.println("Faltam:");
           System.out.println(duracao.toDays() + " dias");
           System.out.println(duracao.toHours() + " horas no total");
       }

    }
}

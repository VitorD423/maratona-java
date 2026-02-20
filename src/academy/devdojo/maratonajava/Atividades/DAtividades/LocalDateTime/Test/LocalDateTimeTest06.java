package academy.devdojo.maratonajava.Atividades.DAtividades.LocalDateTime.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest06 {
    public static void main(String[] args) {
        LocalDateTime dataHoraPrevista = LocalDateTime.of(2026,3,13,4,21);
        LocalDateTime dataHoraReal = LocalDateTime.of(2026,3,14,1,2);


        if (dataHoraReal.isAfter(dataHoraPrevista)){
            long horasAtraso = ChronoUnit.HOURS.between(dataHoraPrevista,dataHoraReal);
            System.out.println("Atraso de: " + horasAtraso + " horas");
        }else {
        System.out.println("Dentro do prazo");
        }


    }
}

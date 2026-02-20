package academy.devdojo.maratonajava.Atividades.DAtividades.LocalDateTime.Test;

import java.time.Duration;
import java.time.LocalDateTime;

public class LocalDateTimeTest07 {
    public static void main(String[] args) {
        LocalDateTime cadastro = LocalDateTime.now();
        LocalDateTime agora = cadastro.plusHours(2);
        Duration duration = Duration.between(cadastro,agora);

        long horas = duration.toHours();

        if (horas > 1){
            long horasCobradas= horas - 1;
            double valor = horasCobradas * 2.50;

            System.out.println("Horas de atraso: " + horas);
            System.out.println("Horas cobradas: " + horasCobradas);
            System.out.println("Multa: R$ " + valor);
        }else {
        System.out.println("Sem multa");
        }
    }
}

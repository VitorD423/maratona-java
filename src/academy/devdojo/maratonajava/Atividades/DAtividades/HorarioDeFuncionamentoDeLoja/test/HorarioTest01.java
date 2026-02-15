package academy.devdojo.maratonajava.Atividades.DAtividades.HorarioDeFuncionamentoDeLoja.test;

import java.time.LocalTime;

public class HorarioTest01 {
    public static void main(String[] args) {
        LocalTime horario = LocalTime.of(18,0);
        LocalTime InicioDoExpediente = LocalTime.of(9,0);
        LocalTime FinalDoExpediente = LocalTime.of(18,0);
        LocalTime InicioDoAlmoco = LocalTime.of(12,0);
        LocalTime FinalDoAlmoco = LocalTime.of(13,0);

        if (!horario.isBefore(InicioDoExpediente) && (horario.isAfter(FinalDoExpediente))) {
            if (!horario.isBefore(InicioDoAlmoco) && (horario.isBefore(FinalDoAlmoco))) {
                System.out.println("Fechado para almoço");
            } else {
                System.out.println("Aberta");

            }

          }else {
            System.out.println("Fechada");
        }
    }
}

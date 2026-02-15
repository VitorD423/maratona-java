package academy.devdojo.maratonajava.Atividades.DAtividades.HorarioDeFuncionamentoDeLoja.test;

import java.time.LocalTime;

public class HorarioTest02 {
    public static void main(String[] args) {
        LocalTime horaio = LocalTime.of(18,0);
        LocalTime inicioDoExpediente = LocalTime.of(9,0);
        LocalTime fimDoExpediente = LocalTime.of(18,0);
        LocalTime inicioDoAlmoco = LocalTime.of(12,0);
        LocalTime finalDoAlmoco = LocalTime.of(12,30);


        if (!horaio.isBefore(inicioDoExpediente) && (horaio.isBefore(fimDoExpediente))){
            if (!horaio.isBefore(inicioDoAlmoco) && (horaio.isBefore(finalDoAlmoco))){
                System.out.println("Fechado para almoço");
            }else {
                System.out.println("Aberto");
            }

        }else {
            System.out.println("Fechado");
        }

    }
}

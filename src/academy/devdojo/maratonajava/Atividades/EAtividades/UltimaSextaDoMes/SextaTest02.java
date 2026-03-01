package academy.devdojo.maratonajava.Atividades.EAtividades.UltimaSextaDoMes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SextaTest02 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate ultimaSexta = hoje.now().with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));


        if (hoje.isAfter(ultimaSexta)){
            ultimaSexta = hoje.plusMonths(1).with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));

        }


        for (int i = 0; i < 6; i++) {

            System.out.println(ultimaSexta);

            ultimaSexta = ultimaSexta
                    .plusMonths(1)
                    .with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        }


    }
}

package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeVencimentoLocalDate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class vencimentoTest02 {
    public static void main(String[] args) {
        LocalDate pagamento = LocalDate.of(2026, 2, 13);
        LocalDate vencimento = pagamento.plusDays(30);
        LocalDate vencimentoAjustado = vencimento;
        while ( vencimentoAjustado.getDayOfWeek() == DayOfWeek.SATURDAY
                || vencimentoAjustado.getDayOfWeek() == DayOfWeek.SUNDAY
                || isFeriado(vencimentoAjustado)){
            vencimentoAjustado = vencimentoAjustado.plusDays(1);
        }

        System.out.println("Dia de pagamento: " + pagamento);
        System.out.println("Vencimento original: " + vencimento);
        System.out.println("Vencimento ajustado: " + vencimentoAjustado);
    }

    public static boolean isFeriado(LocalDate date){
        if (date.getMonthValue() == 1 && date.getDayOfMonth() == 1){
            return true;
        }

        if (date.getMonthValue() == 12 && date.getDayOfMonth() == 25){
            return true;
        }

        if (date.getMonthValue() == 4 && date.getDayOfMonth() == 21){
            return true;
        }

        if (date.getMonthValue() == 9 && date.getDayOfMonth() == 7){
            return true;
        }
        return false;
    }

}

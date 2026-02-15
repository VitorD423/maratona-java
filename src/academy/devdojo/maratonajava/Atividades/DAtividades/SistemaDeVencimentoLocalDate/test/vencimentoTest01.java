package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeVencimentoLocalDate.test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class vencimentoTest01 {
    public static void main(String[] args) {
        LocalDate pagamento = LocalDate.of(2026, 2, 13);
        LocalDate vencimento = pagamento.plusDays(10);
        LocalDate vencimentoAjustado = vencimento;
        System.out.println(pagamento.getDayOfWeek());
        if (vencimento.getDayOfWeek() == DayOfWeek.SATURDAY){
            vencimentoAjustado = vencimento.plusDays(3);
            System.out.println(vencimentoAjustado.getDayOfWeek());
        } else if (vencimento.getDayOfWeek() == DayOfWeek.SUNDAY){
            vencimentoAjustado = vencimento.plusDays(1);
        }
        System.out.println("Dia de pagamento: " + pagamento);
        System.out.println("Data original do vencimento: " + vencimento);
        System.out.println("Data final ajustada: " + vencimentoAjustado);
    }
}

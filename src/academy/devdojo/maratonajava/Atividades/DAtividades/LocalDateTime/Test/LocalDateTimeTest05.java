package academy.devdojo.maratonajava.Atividades.DAtividades.LocalDateTime.Test;

import java.time.LocalDateTime;

public class LocalDateTimeTest05 {
    public static void main(String[] args) {
        LocalDateTime cadastro = LocalDateTime.now();
        LocalDateTime vencimento = cadastro.plusDays(1);
        LocalDateTime agora = LocalDateTime.now();

        double valor = 100;

        if (agora.isAfter(vencimento)){
            valor += valor * 0.02;
            System.out.println("Você vai pagar: " + valor);
        }
        System.out.println("Valor normal: " + valor);
    }
}

package academy.devdojo.maratonajava.Atividades.EAtividades.LoginBrasilxJapao;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class loginTest01 {
    public static void main(String[] args) {
        Instant loginInstante = Instant.now();

        System.out.println("Salvo no banco (UTC): " + loginInstante);

        ZonedDateTime brasil = loginInstante.atZone(ZoneId.of("America/Sao_Paulo"));

        System.out.println("Brasil: " + brasil);

        ZonedDateTime japao = loginInstante.atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println("Japão: " + japao);

        ZonedDateTime utc = loginInstante.atZone(ZoneId.of("UTC"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formatted = utc.format(formatter);

        System.out.println(formatted);


    }
}

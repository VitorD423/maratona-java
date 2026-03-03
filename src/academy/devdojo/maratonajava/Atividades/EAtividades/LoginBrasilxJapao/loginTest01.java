package academy.devdojo.maratonajava.Atividades.EAtividades.LoginBrasilxJapao;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class loginTest01 {
    public static void main(String[] args) {
        Instant login = Instant.now();

        ZonedDateTime brasil = login.atZone(ZoneId.of("America/Sao_Paulo"));

        ZonedDateTime japao = login.atZone(ZoneId.of("Asia/Tokyo"));
    }
}

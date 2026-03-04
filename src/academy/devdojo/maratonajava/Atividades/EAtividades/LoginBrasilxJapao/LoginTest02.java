package academy.devdojo.maratonajava.Atividades.EAtividades.LoginBrasilxJapao;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LoginTest02 {
    public static void main(String[] args) {
        Instant loginInstante = Instant.now();

        String zonaUsuario = "Asia/Tokyo";

        ZonedDateTime dataUsuario = loginInstante.atZone(ZoneId.of(zonaUsuario));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário do usuário: " + dataUsuario.format(formatter));


    }
}

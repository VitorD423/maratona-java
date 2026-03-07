package academy.devdojo.maratonajava.Atividades.EAtividades.SistemaDeLoginGlobal.service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LoginServico {
public String registrarLogin(String nomeCliente, String zonaUsuario){
    Instant loginInstant = Instant.now();
    ZoneId zone = ZoneId.of(zonaUsuario);
    ZonedDateTime horarioUsuario = loginInstant.atZone(zone);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    return nomeCliente + " logou às " + horarioUsuario.format(formatter);
}
}

package academy.devdojo.maratonajava.Atividades.EAtividades.Informacoes.test;

import java.text.MessageFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class InfoTest01 {
    public static void main(String[] args) {
        Instant agora = Instant.now();
        String nome = "Vitor";
        String zonaUsuario = "Asia/Tokyo";
        Locale locale =Locale.forLanguageTag("en-US");

        ZonedDateTime dataUsuario = agora.atZone(ZoneId.of(zonaUsuario));

        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);

        String pattern = bundle.getString("welcome");

        MessageFormat format = new MessageFormat(pattern,locale);

        String mensagem = format.format(new Object[]{nome, Date.from(dataUsuario.toInstant())});

        System.out.println(mensagem);



    }
}

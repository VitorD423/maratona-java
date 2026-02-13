package academy.devdojo.maratonajava.Atividades.DAtividades.Internacionalizacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class InternacionalizacaoTest01 {
    public static void main(String[] args) {
        Locale localeBrasil = Locale.forLanguageTag("pt-BR");
        Locale localeEUA = Locale.forLanguageTag("en-US");
        Locale localeJapao = Locale.forLanguageTag("ja-JP");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeBrasil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeEUA);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeJapao);

        System.out.println("Brasil: " +df1.format(calendar.getTime()));
        System.out.println("Eua: " +df2.format(calendar.getTime()));
        System.out.println("Japao: " +df3.format(calendar.getTime()));

    }
}

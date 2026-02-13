package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
            String pattern = "yyyy.MM.dd G 'at' (KK:a:ss z)";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

//        try {
//            System.out.println(sdf.parse("Amsterdam 13 de fevereiro de 2026")); // tem que ser exatamente igula ao pattern
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
    }
}
//yyyy.MM.dd G 'at' HH:mm:ss z"
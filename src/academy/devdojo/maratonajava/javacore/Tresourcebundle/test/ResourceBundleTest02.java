package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest02 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages",new Locale("pt","BR"));
        String pattern = bundle.getString("login");
        String mensagem = MessageFormat.format(pattern,"Vitor",new Date());
        System.out.println(mensagem);
    }
}

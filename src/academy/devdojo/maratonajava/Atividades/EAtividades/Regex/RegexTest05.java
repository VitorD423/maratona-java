package academy.devdojo.maratonajava.Atividades.EAtividades.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest05 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, digitos, _
        // \W = Tudo o que não for incluso no \w
        // [] = vai procurar por algo dentro do colchete por exemplo
        // [abc] vai procurar ou por a ou por b ou por c
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // () Agrupamento
        // | o(v|c)o ovo | oco
        // $
        // . 1.3 = 123, 133, 1@3, 1A3

        String regex = "\\d+.\\d+.\\d+.\\d+";
        String texto = "User login from 192.168.0.1 and 10.0.0.45";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()){
            System.out.print(matcher.group()+"\n");
        }

    }
}

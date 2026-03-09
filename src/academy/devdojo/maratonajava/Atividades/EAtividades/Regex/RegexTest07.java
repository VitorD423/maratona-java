package academy.devdojo.maratonajava.Atividades.EAtividades.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest07 {
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
        // ^ INICIO DA STRING
        // $ FIM DA STRING
        // . 1.3 = 123, 133, 1@3, 1A3

        // (?=.*[A-Z]) Isso é um lookahead : existe uma
        // letra maiúscula em algum lugar da string
        //(?=.*\d)
        //.{8,} : Qualquer caractere no mínimo 8 vezes

        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        String texto = "Java1234";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);


        if (texto.matches(regex)){
            System.out.println("Senha válido");
        }else {
            System.out.println("Senha inválido");
        }
//        while (matcher.find()){
//            System.out.print(matcher.group()+"\n");
//        }

    }
}

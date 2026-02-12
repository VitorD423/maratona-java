package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // Pega um caractere selecionado nesse caso o primeiro 0
        System.out.println(nome.length()); // Conta quantos caracteres tem sempre começando do zero
        System.out.println(nome.replace("f","l")); // troca o f pelo l na string
        System.out.println(nome.toLowerCase()); // transforma tudo em minúsculo
        System.out.println(nome.toUpperCase()); // transforma tudo em maiúsculo
        System.out.println(numeros.length());
        System.out.println(nome.substring(3,5)); // Você escolhe de onde vai querer que a string seja retornada nesse caso vai ser apartir do indece 3 e vai terminar no 5
        System.out.println(nome.trim()); // remove os espaçoes em branco da string
    }
}

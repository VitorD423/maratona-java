package academy.devdojo.maratonajava.Atividades.FAtividades.Streams.test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Nivelacao;
import academy.devdojo.maratonajava.Atividades.FAtividades.Streams.dominio.Personagem;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonagemTest07 {
    public static void main(String[] args) {
        List<Personagem> personagens = List.of(new Personagem("Vitor", "Mago", 22), new Personagem("Arthur", "Guerreiro", 50), new Personagem("Merlin", "Mago", 80), new Personagem("Legolas", "Arqueiro", 65), new Personagem("Frieren", "Mago", 100), new Personagem("Guts", "Guerreiro", 90), new Personagem("Hanzo", "Arqueiro", 45));

        System.out.println("Tarefa A");
        System.out.println("Crie uma lista contendo apenas os nomes dos personagens com nível maior ou igual a 50.");
        String string = personagens.stream().filter(personagem -> personagem.getNivel() >= 50).map(Personagem::getNome).collect(Collectors.joining(", "));
        System.out.println(string);
        System.out.println();


        System.out.println("Tarefa B");
        System.out.println("Calcule a média dos níveis de todos os personagens.");
        double media = personagens.stream().mapToInt(Personagem::getNivel).average().orElse(0.0);
        System.out.println(media);
        System.out.println();

        System.out.println("Tarefa C" );
        System.out.println("Descubra qual classe possui mais personagens.");
        Map<String, Long> cou = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse, Collectors.counting()));
        System.out.println(cou.entrySet().map);

        System.out.println("Tarefa D");
        System.out.println("Agrupe os personagens por classe");
        Map<String, List<Personagem>> collect = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse));
        System.out.println(collect);
        System.out.println();

        System.out.println("Tarefa E");
        System.out.println("Agrupe os personagens por classe e por nivelação");
        Map<String, Map<Nivelacao, List<Personagem>>> collect1 = personagens.stream().collect(Collectors.groupingBy(Personagem::getClasse,
                Collectors.groupingBy(ln -> ln.getNivel() < 50 ? Nivelacao.BAIXO : ln.getNivel() < 80 ? Nivelacao.MEDIO : Nivelacao.ALTO)));
        System.out.println(collect1);
    }
}

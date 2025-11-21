package academy.devdojo.maratonajava.javacore.Atividade.test;

import academy.devdojo.maratonajava.javacore.Atividade.dominio.Anime;
import academy.devdojo.maratonajava.javacore.Atividade.dominio.AnimeService;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        AnimeService animeService = new AnimeService();
        anime.init("Jojo", "Ação", 40);
        anime.imprimeAnime();
        System.out.println("//////////////");
        animeService.aumentarEpisodios(anime,10);
        anime.imprimeAnime();
        animeService.mudarTipo(anime,"Aventura");
        anime.imprimeAnime();
        System.out.println("//////////////");
        Anime copia = animeService.criarCopia(anime);
        copia.imprimeAnime();
        copia.setNome("Jojo Cópia");
        System.out.println("Original: ");
        anime.imprimeAnime();
        System.out.println("Cópia: ");
        copia.imprimeAnime();


    }
}

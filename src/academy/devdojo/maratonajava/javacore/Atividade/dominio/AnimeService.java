package academy.devdojo.maratonajava.javacore.Atividade.dominio;

public class AnimeService {

    public void aumentarEpisodios(Anime anime, int quantidade){
      int episodiosAtuais = anime.getEpisodios();
      int novoValor = episodiosAtuais + quantidade;
      anime.setEpisodios(novoValor);

    }

    public void mudarTipo(Anime anime, String novoTipo){
        anime.setTipo(novoTipo);

    }

    public Anime criarCopia(Anime original){
        Anime copia = new Anime();
        String nome = original.getNome();
        String tipo = original.getTipo();
        int episodios = original.getEpisodios();

        copia.init(nome, tipo, episodios);
        return copia;

    }
}

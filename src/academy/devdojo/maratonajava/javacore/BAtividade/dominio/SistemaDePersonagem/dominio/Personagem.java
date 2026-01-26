package academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDePersonagem.dominio;

public class Personagem {
    private String nome;
    private ClassePersonagem classe;
    private TipoAtaque tipoAtaque;

    public Personagem(String nome, ClassePersonagem classe, TipoAtaque tipoAtaque) {
        this.nome = nome;
        this.classe = classe;
        this.tipoAtaque = tipoAtaque;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classe=" + classe.getDescricao() +
                ", tipoAtaque=" + tipoAtaque.getMultiplicadorDeDano() +
                '}';
    }




    public String getNome() {
        return nome;
    }

    public ClassePersonagem getClasse() {
        return classe;
    }

    public TipoAtaque getTipoAtaque() {
        return tipoAtaque;
    }
}

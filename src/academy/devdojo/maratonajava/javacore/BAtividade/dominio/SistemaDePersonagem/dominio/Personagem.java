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


    public double calcularDanoTotal(){
      return classe.getValorBaseDeVida() + tipoAtaque.getMultiplicadorDeDano();

    }


    @Override
    public String toString() {
        return "\nPersonagem: " +
                "\n Nome: " + nome +
                "\n Classe: " + classe.getNome() +
                "\n Descrição " + classe.getDescricao() +
                "\n Tipo ataque: " + tipoAtaque.getMultiplicadorDeDano() +
                "\n Vida base: " + classe.getValorBaseDeVida() +
                "\n Dano Total: " + calcularDanoTotal()
                ;
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

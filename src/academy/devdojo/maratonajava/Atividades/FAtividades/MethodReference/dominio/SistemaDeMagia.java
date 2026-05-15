package academy.devdojo.maratonajava.Atividades.FAtividades.MethodReference.dominio;

public class SistemaDeMagia {
    private String nome;
    private int dano;

    public SistemaDeMagia(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    @Override
    public String toString() {
        return "SistemaDeMagia{" +
                "nome='" + nome + '\'' +
                ", dano=" + dano +
                '}';
    }
}

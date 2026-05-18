package academy.devdojo.maratonajava.Atividades.FAtividades.Optional.dominio;

public class Pocao {
    private Integer id;
    private String nome;
    private int cura;

    public Pocao(Integer id, String nome, int cura) {
        this.id = id;
        this.nome = nome;
        this.cura = cura;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCura() {
        return cura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pocao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cura=" + cura +
                '}';
    }
}

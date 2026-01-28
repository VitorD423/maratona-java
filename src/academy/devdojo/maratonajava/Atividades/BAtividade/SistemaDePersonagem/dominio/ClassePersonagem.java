package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePersonagem.dominio;

public enum ClassePersonagem {
    GUERREIRO("Guerreiro",200,"Gosta de Lutar"),
    MAGO("Mago",70,"Magia"),
    ARQUEIRO("Arqueiro",120,"Flecha");

    private String nome;
    private double valorBaseDeVida;
    private String descricao;

    ClassePersonagem(String nome,double valorBaseDeVida, String descricao) {
        this.nome = nome;
        this.valorBaseDeVida = valorBaseDeVida;
        this.descricao = descricao;
    }

    public double getValorBaseDeVida() {
        return valorBaseDeVida;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }
}

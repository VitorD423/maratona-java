package academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDePersonagem.dominio;

public enum ClassePersonagem {
    GUERREIRO(200,"Gosta de Lutar"),
    MAGO(70,"Magia"),
    ARQUEIRO(120,"Flecha");

    private double valorBaseDeVida;
    private String descricao;

    ClassePersonagem(double valorBaseDeVida, String descricao) {
        this.valorBaseDeVida = valorBaseDeVida;
        this.descricao = descricao;
    }

    public double getValorBaseDeVida() {
        return valorBaseDeVida;
    }

    public String getDescricao() {
        return descricao;
    }
}

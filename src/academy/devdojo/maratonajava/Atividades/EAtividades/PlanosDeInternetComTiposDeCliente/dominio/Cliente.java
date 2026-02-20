package academy.devdojo.maratonajava.Atividades.EAtividades.PlanosDeInternetComTiposDeCliente.dominio;

public abstract class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public double aplicarBeneficio(double valorPlano) {
        return valorPlano;
    }






    public String getNome() {
        return nome;
    }
}

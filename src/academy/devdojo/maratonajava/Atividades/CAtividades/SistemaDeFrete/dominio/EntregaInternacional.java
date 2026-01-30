package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.dominio;

public class EntregaInternacional extends Entrega {
    private String paisDestino;

    public EntregaInternacional(String descricao, double peso, String paisDestino) {
        super(descricao, peso);
        this.paisDestino = paisDestino;
    }

    @Override
    public double calcularFrete() {
        return getPeso() * 20;
    }

    public String getPaisDestino() {
        return paisDestino;
    }
}

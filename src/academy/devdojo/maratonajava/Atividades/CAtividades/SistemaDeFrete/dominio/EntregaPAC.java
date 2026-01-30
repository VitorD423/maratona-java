package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.dominio;

public class EntregaPAC extends Entrega{
    public EntregaPAC(String descricao, double peso) {
        super(descricao, peso);
    }

    @Override
    public double calcularFrete() {
        return getPeso() * 5;
    }
}

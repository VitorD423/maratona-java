package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.dominio;

public class EntregaSedex extends Entrega{
    public EntregaSedex(String descricao, double peso) {
        super(descricao, peso);
    }

    @Override
    public double calcularFrete() {
        return getPeso() * 10;
    }
}

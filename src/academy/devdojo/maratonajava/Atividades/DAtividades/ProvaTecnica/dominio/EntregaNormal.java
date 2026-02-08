package academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.dominio;

public class EntregaNormal extends Entrega implements Processavel{
    public EntregaNormal(String destinatario, double peso, TipoEntrega tipoEntrega) {
        super(destinatario, peso, tipoEntrega);
    }

    @Override
    public double calcularCusto() {

        return getPeso() * 5;
    }

    @Override
    public void processarEntrega() {
        System.out.println("Entrega normal em processamento");
    }

    @Override
    public void processar() {
        System.out.println("Processando entrega normal");
    }
}

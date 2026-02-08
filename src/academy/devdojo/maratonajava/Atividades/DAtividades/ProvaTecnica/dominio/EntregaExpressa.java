package academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.dominio;

public class EntregaExpressa extends Entrega implements Processavel{
    public EntregaExpressa(String destinatario, double peso, TipoEntrega tipoEntrega) {
        super(destinatario, peso, tipoEntrega);
    }

    @Override
    public double calcularCusto() {

        if (getPeso() > 50){
            throw new IllegalArgumentException("Não pode ser expressa");
        }
        return getPeso() * 10;
    }

    @Override
    public void processarEntrega() {
        System.out.println("Entrega expressa prioritária");
    }

    @Override
    public void processar() {
        System.out.println("Processando entrega expressa");
    }
}

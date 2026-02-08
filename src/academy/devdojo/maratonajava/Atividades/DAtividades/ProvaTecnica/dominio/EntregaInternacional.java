package academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.dominio;

public class EntregaInternacional extends Entrega implements Processavel{
    private double taxa = 100;


    public EntregaInternacional(String destinatario, double peso, TipoEntrega tipoEntrega) {
        super(destinatario, peso, tipoEntrega);
    }

    @Override
    public double calcularCusto() {
        if (getPeso() > 30){
            throw new IllegalStateException("Peso não pode ser maior que 30");
        }

        return getPeso() * 20 + taxa;
    }

    @Override
    public void processarEntrega() {
        System.out.println("Entrega internacional em análise alfandegária");
    }

    @Override
    public void processar() {
        System.out.println("Processando entrega internacional");
    }

    public double getTaxa() {
        return taxa;
    }
}

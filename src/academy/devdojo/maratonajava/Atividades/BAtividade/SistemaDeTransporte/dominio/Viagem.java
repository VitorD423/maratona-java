package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeTransporte.dominio;

public class Viagem {
    private String destino;
    private double distancia;
    private MeioTransporte meioTransporte;
    private TipoPassageiro tipoPassageiro;

    public Viagem(String destino, double distancia, MeioTransporte meioTransporte, TipoPassageiro tipoPassageiro) {
        this.destino = destino;
        this.distancia = distancia;
        this.meioTransporte = meioTransporte;
        this.tipoPassageiro = tipoPassageiro;
    }

    public double valorFinal() {
        return meioTransporte.calcularCusto(distancia) * tipoPassageiro.getPercentualPago();
    }

    public void imprimir(){
        System.out.println("Destino: " + this.destino);
        System.out.println("Transporte: " + meioTransporte.getNome());
        System.out.println("Passageiro: " + tipoPassageiro.getNome());
        System.out.println("Valor final: " + valorFinal());
    }
}

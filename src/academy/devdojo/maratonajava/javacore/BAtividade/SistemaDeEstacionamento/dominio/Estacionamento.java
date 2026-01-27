package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeEstacionamento.dominio;

public class Estacionamento {
    private int placa;
    private double horas;
    private TipoVeiculo tipoVeiculo;
    private TipoCliente tipoCliente;


    public Estacionamento(int placa, double horas, TipoVeiculo tipoVeiculo, TipoCliente tipoCliente) {
        this.placa = placa;
        this.horas = horas;
        this.tipoVeiculo = tipoVeiculo;
        this.tipoCliente = tipoCliente;
    }

    public double valorFinal(){
        return tipoVeiculo.calcularCusto(horas) * tipoCliente.getDesconto();
    }

    public void imprimi(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Tipo de veiculo: " + tipoVeiculo.getNome());
        System.out.println("Tipo de cliente: " + tipoCliente.getNome());
        System.out.println("Horas: " + this.horas);
        System.out.println("Valor final : " + valorFinal());
    }
}

package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeEstacionamento.dominio;

public enum TipoVeiculo {
    MOTO("Moto",2){
        @Override
        public double calcularCusto(double horas) {
            return valorPorHora * horas;
        }
    },
    CARRO("Carro",5){
        @Override
        public double calcularCusto(double horas) {
            return valorPorHora * horas;
        }
    },
    CAMINHAO("Caminhao", 20){
        @Override
        public double calcularCusto(double horas) {
            return valorPorHora * horas;
        }
    };

    public final String nome;
    public final double valorPorHora;
    public abstract double calcularCusto(double horas);


    TipoVeiculo(String nome, double valorPorHora) {
        this.nome = nome;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }
}

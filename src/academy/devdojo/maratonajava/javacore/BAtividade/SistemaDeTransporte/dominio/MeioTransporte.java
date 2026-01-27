package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeTransporte.dominio;

public enum MeioTransporte {
    CARRO("Carro"){
        @Override
        public double calcularCusto(double distancia) {
            return distancia * 5;
        }
    },
    ONIBUS("Onibus"){
        @Override
        public double calcularCusto(double distancia) {
            return distancia * 10;
        }
    },
    AVIAO("Aviao"){
        @Override
        public double calcularCusto(double distancia) {
            return distancia * 40;
        }
    };

    public String nome;
    public abstract double calcularCusto(double distancia);

    MeioTransporte(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

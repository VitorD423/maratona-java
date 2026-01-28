package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeFreteDeEntregas.dominio;

public enum TipoEntrega {
    ECONOMIA("Economia",0.05){
        @Override
        public double custoEntrega(double valorBase) {
            return valorBase * multiplicador;
        }
    },
    NORMAL("Normal",0.10){
        @Override
        public double custoEntrega(double valorBase) {
            return valorBase * multiplicador;
        }
    },
    EXPRESSA("Expressa",0.25){
        @Override
        public double custoEntrega(double valorBase) {
            return valorBase * multiplicador;
        }
    };

    public abstract double custoEntrega(double valorBase);
    public String nome;
    public double multiplicador;

    TipoEntrega(String nome, double multiplicador) {
        this.nome = nome;
        this.multiplicador = multiplicador;
    }

    public String getNome() {
        return nome;
    }
}

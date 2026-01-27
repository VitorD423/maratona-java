package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDePlanoDeStreming.dominio;

public enum TipoDePlano {
    BASICO("Basico",0.10){
        @Override
        public double calcularImposto(double valorBase) {
            return valorBase * percentualDeImposto;
        }
    },
    PADRAO("Padrao",0.30){
        @Override
        public double calcularImposto(double valorBase) {
            return valorBase * percentualDeImposto;
        }
    },
    PREMIUM("Premium",0.60){
        @Override
        public double calcularImposto(double valorBase) {
            return valorBase * percentualDeImposto;
        }
    };

    public String nomeDoPlano;
    public double percentualDeImposto;
    public abstract double calcularImposto(double valorBase);

    TipoDePlano(String nomeDoPlano, double percentualDeImposto) {
        this.nomeDoPlano = nomeDoPlano;
        this.percentualDeImposto = percentualDeImposto;
    }

    public String getNomeDoPlano() {
        return nomeDoPlano;
    }

    public double getPercentualDeImposto() {
        return percentualDeImposto;
    }
}


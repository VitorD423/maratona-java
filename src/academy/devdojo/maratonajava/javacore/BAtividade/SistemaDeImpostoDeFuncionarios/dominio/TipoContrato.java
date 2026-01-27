package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeImpostoDeFuncionarios.dominio;

public enum TipoContrato {
    CLT(0.20,"CLT"){
        @Override
        public double calcularImposto(double salarioBase) {
            return salarioBase * percentualDeImposto;
        }
    },
    PJ(0.10,"PJ"){
        @Override
        public double calcularImposto(double salarioBase) {
            return salarioBase * percentualDeImposto;
        }
    };

    public double percentualDeImposto;
    public String descricaoTextual;

    public abstract double calcularImposto(double salarioBase);


    TipoContrato(double percentualDeImposto, String descricaoTextual) {
        this.percentualDeImposto = percentualDeImposto;
        this.descricaoTextual = descricaoTextual;
    }

    public double getPercentualDeImposto() {
        return percentualDeImposto;
    }

    public String getDescricaoTextual() {
        return descricaoTextual;
    }
}

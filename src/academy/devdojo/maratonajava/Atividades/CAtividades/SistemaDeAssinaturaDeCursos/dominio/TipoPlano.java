package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeAssinaturaDeCursos.dominio;

public enum TipoPlano {
    BASICO{
        @Override
        public double calcularDesconto(double valorBase) {
            return 0;
        }
    },
    PADRAO{
        @Override
        public double calcularDesconto(double valorBase) {
            return valorBase * 0.10;
        }
    },
    PREMIUM{
        @Override
        public double calcularDesconto(double valorBase) {
            return valorBase * 0.20;
        }
    };

    public abstract double calcularDesconto(double valorBase);
}

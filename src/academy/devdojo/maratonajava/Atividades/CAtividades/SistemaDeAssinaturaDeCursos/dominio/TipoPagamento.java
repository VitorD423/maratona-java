package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeAssinaturaDeCursos.dominio;

public enum TipoPagamento implements FormaDePagamento{
    CARTAO{
        @Override
        public double calcularTaxa(double valorBase) {
            return valorBase * 0.06;
        }
    },
    BOLETO{
        @Override
        public double calcularTaxa(double valorBase) {
            return 4;
        }
    },
    PIX{
        @Override
        public double calcularTaxa(double valorBase) {
            return 0;
        }
    };

}

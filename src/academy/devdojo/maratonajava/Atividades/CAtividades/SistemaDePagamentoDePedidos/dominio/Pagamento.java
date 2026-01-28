package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDePedidos.dominio;

public enum Pagamento implements FormaDePagamento{
    CARTAO{
        @Override
        public double calcularTaxa(double valorBase) {
            return valorBase * 0.05;
        }
    },


    PIX{
        @Override
        public double calcularTaxa(double valorBase) {
            return 0;
        }
    },


    BOLETO{
        @Override
        public double calcularTaxa(double valorBase) {
            return 3;
        }
    };
}

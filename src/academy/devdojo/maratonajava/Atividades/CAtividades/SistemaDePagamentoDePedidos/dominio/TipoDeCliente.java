package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoDePedidos.dominio;

public enum TipoDeCliente {
    COMUN{
        @Override
        public double CalcularDesconto(double valorBase) {
            return 0;
        }
    },
    VIP{
        @Override
        public double CalcularDesconto(double valorBase) {
            return valorBase * 0.10;
        }
    };

    public abstract double CalcularDesconto(double valorBase);




}

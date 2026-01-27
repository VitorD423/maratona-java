package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDePlanoDeStreming.dominio;

public class UsuarioEmpresa extends Usuario {
    public UsuarioEmpresa(String nome, double valorPlano, TipoDePlano tipoDePlano) {
        super(nome, valorPlano, tipoDePlano);
    }


    @Override
    public double calcularImposto() {
        double impostoPlano = tipoDePlano.calcularImposto(valorPlano);
        return  impostoPlano * 1.10;
    }
}

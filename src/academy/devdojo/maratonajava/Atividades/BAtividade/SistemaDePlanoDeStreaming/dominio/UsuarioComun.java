package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDePlanoDeStreaming.dominio;

public class UsuarioComun extends Usuario {
    public UsuarioComun(String nome, double valorPlano, TipoDePlano tipoDePlano) {
        super(nome, valorPlano, tipoDePlano);
    }


    @Override
    public double calcularImposto() {
        return  tipoDePlano.calcularImposto(valorPlano);
    }
}

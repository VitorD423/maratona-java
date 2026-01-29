package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeAssinaturaDeCursos.test;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeAssinaturaDeCursos.dominio.*;

public class AssinaturaTest {
    public static void main(String[] args) {
        Assinatura assinatura1 = new AssinaturaComun(100, TipoPagamento.CARTAO, TipoPlano.PADRAO);
        Assinatura assinatura2 = new AssinaturaEmpresa(200,TipoPagamento.BOLETO,TipoPlano.PREMIUM);

        assinatura1.imprimirResumo();
        System.out.println("-------------------");
        assinatura2.imprimirResumo();
    }
}

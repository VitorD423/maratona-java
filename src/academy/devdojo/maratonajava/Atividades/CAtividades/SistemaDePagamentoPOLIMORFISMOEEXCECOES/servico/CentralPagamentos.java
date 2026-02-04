package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.servico;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.dominio.*;

public class CentralPagamentos {
    public static void processar(ProcessavelPagamento processavelPagamento){
        processavelPagamento.processar();
    }

    public static void gerarRelatorio(Pagamento pagamento){
        System.out.println("Valor: " + pagamento.getValor());

        if (pagamento instanceof PagamentoCartao){
            PagamentoCartao pagamentoCartao = (PagamentoCartao) pagamento;
            System.out.println("Limite do cartão: " + pagamentoCartao.getLimite());
        }

        if (pagamento instanceof PagamentoBoleto){
             PagamentoBoleto pagamentoBoleto = (PagamentoBoleto) pagamento;
            System.out.println("Codigo de barras: " + pagamentoBoleto.getCodigoBarras());
        }

        if (pagamento instanceof PagamentoPix){
            PagamentoPix pagamentoPix = (PagamentoPix) pagamento;
            System.out.println("Chave pix: " + pagamentoPix.getChavePix());
        }
    }
}

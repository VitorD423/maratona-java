package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.test;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.dominio.Pagamento;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.dominio.PagamentoBoleto;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.dominio.PagamentoCartao;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.dominio.PagamentoPix;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDePagamentoPOLIMORFISMOEEXCECOES.servico.CentralPagamentos;

public class PagamentoTest {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartao(500,300);
        Pagamento pagamento2 = new PagamentoBoleto(200,"                 ");
        Pagamento pagamento3 = new PagamentoPix(1000,null);

        try {
        CentralPagamentos.processar(pagamento1);
            System.out.println("Pagamento feito");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        CentralPagamentos.gerarRelatorio(pagamento1);

        System.out.println("---------------------");

        try {
            CentralPagamentos.processar(pagamento2);
            System.out.println("Deu certo");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        CentralPagamentos.gerarRelatorio(pagamento2);

        System.out.println("--------------------");

        try {
            CentralPagamentos.processar(pagamento3);
            System.out.println("Deu certo");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        CentralPagamentos.gerarRelatorio(pagamento3);
    }
}

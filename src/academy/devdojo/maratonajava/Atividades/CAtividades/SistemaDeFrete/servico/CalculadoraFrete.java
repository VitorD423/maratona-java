package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.servico;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.dominio.Entrega;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.dominio.EntregaInternacional;


public class CalculadoraFrete {
    public static void calcularFrete(Entrega entrega){
        System.out.println("Relatorio: ") ;
        System.out.println("Descrição: " + entrega.getDescricao());
        System.out.println("Valor do frete: " + entrega.calcularFrete());
        if (entrega instanceof EntregaInternacional){
            EntregaInternacional entregaInternacional = (EntregaInternacional)  entrega;
            System.out.println("Pais de destino: " + entregaInternacional.getPaisDestino());
        }
    }
}

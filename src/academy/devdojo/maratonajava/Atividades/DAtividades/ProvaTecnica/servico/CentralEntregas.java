package academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.servico;

import academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.dominio.Entrega;
import academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.dominio.EntregaExpressa;
import academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.dominio.EntregaInternacional;
import academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.dominio.Processavel;

public class CentralEntregas {

    public static void processar(Processavel processavel){
        processavel.processar();
    }

    public static void gerarRelatorio(Entrega entrega){
        System.out.println("Dentinatário: " + entrega.getDestinatario());
        System.out.println("Tipo" + entrega.getTipoEntrega());
        System.out.println("Custo final: " + entrega.calcularCusto());

        if (entrega instanceof EntregaInternacional){
            EntregaInternacional entregaInternacional = (EntregaInternacional) entrega;
            System.out.println("Codigo de barras:" + entregaInternacional.getTaxa());
        }

        if (entrega instanceof EntregaExpressa){
            EntregaExpressa entregaExpressa = (EntregaExpressa) entrega;
            System.out.println("É prioridade");
        }
    }
}

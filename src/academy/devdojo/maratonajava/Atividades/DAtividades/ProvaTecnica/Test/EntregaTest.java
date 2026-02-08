package academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.Test;

import academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.dominio.*;
import academy.devdojo.maratonajava.Atividades.DAtividades.ProvaTecnica.servico.CentralEntregas;

public class EntregaTest {
    public static void main(String[] args) {
        Entrega entregaNormal = new EntregaNormal("Vitor",300, TipoEntrega.NORMAL);
        Entrega entregaExpresso = new EntregaExpressa("Diego",20,TipoEntrega.EXPRESSA);
        Entrega entregaInternacional = new EntregaInternacional("Torres",60,TipoEntrega.INTERNACIONAL);

        CentralEntregas.processar(entregaNormal);
        System.out.println("---------------");
        CentralEntregas.processar(entregaExpresso);
        System.out.println("---------------");
        CentralEntregas.processar(entregaInternacional);

        System.out.println("--------------------");

        try {
            CentralEntregas.gerarRelatorio(entregaNormal);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            CentralEntregas.gerarRelatorio(entregaExpresso);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            CentralEntregas.gerarRelatorio(entregaInternacional);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }



    }
}

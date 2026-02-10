package academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeAtendimento.inteface;

import academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeAtendimento.dominio.Atendimento;
import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDePagamentoDePedidos.dominio.Processavel;

public class CentralAtendimentos {
    public static void processar(Processavel p){
        p.processar();
    }

    public static void gerarRelatorio(Atendimento a){
        System.out.println("Cliente: " + a.getCliente());
        System.out.println("Tipo: " + a.getTipoAtendimento());
        System.out.println("Tempo final: " + a.calcularTempoFinal());
    }
}

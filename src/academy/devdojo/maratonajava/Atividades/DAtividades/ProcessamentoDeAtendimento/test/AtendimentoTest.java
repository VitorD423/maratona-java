package academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeAtendimento.test;

import academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeAtendimento.dominio.*;
import academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeAtendimento.inteface.CentralAtendimentos;

public class AtendimentoTest {
    public static void main(String[] args) {
        Atendimento atendimentoNormal = new AtendimentoNormal("Vitor", 40, TipoAtendimento.NORMAL);
        Atendimento atendimentoPrioritario = new AtendimentoPrioritario("Diego",500,TipoAtendimento.PRIORITARIO);
        Atendimento atendimentoTecnico = new AtendimentoTecnico("Torres",500,TipoAtendimento.TECNICO);

        CentralAtendimentos.processar(atendimentoNormal);
        System.out.println("---------------");
        CentralAtendimentos.processar(atendimentoPrioritario);
        System.out.println("---------------");
        CentralAtendimentos.processar(atendimentoTecnico);
        System.out.println("---------------");

        try {
            CentralAtendimentos.gerarRelatorio(atendimentoNormal);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("---------------");

        try {
            CentralAtendimentos.gerarRelatorio(atendimentoPrioritario);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("---------------");

        try {
            CentralAtendimentos.gerarRelatorio(atendimentoTecnico);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}

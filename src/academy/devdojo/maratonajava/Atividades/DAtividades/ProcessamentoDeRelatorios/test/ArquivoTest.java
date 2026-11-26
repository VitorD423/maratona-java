package academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeRelatorios.test;

import academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeRelatorios.service.RelatorioService;

public class ArquivoTest {
    public static void main(String[] args) {
        RelatorioService.gerarRelatorio(false);
        System.out.println("--------------");
        RelatorioService.gerarRelatorio(true);
    }
}

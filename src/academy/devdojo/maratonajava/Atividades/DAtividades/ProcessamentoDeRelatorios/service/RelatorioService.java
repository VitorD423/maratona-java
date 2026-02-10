package academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeRelatorios.service;

import academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeRelatorios.dominio.ArquivoLog;
import academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeRelatorios.dominio.ConexaoBanco;

public class RelatorioService {
    public static void gerarRelatorio(boolean erro) {
        try (ConexaoBanco banco = new ConexaoBanco();
             ArquivoLog log = new ArquivoLog()) {

            System.out.println("Gerando relatório...");

            if (erro) {
                throw new RuntimeException("Erro ao gerar relatório");
            }

            System.out.println("Relatório gerado com sucesso");

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    }



package academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeRelatorios.dominio;

import java.io.Closeable;


public class ArquivoLog implements Closeable {
    @Override
    public void close() throws RuntimeException {
        System.out.println("Fechando arquivo de log");
    }
}

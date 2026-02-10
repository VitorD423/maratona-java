package academy.devdojo.maratonajava.Atividades.DAtividades.ProcessamentoDeRelatorios.dominio;

import java.io.Closeable;


public class ConexaoBanco implements Closeable {
    @Override
    public void close() throws RuntimeException {
        System.out.println("Fechando conexão com banco");
    }
}

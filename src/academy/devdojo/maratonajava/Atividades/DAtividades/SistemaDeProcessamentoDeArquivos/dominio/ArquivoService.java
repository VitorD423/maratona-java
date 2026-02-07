package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeProcessamentoDeArquivos.dominio;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ArquivoService {


    public static void processarArquivo(String nomeArquivo, int tamanho) throws FileNotFoundException , SQLException {
        if (nomeArquivo == null || nomeArquivo.isBlank()){
            throw new IllegalArgumentException("Nome invalido");
        }

        if (tamanho <= 0){
            throw new ArithmeticException("Tamanho invalido");
        }

        if (nomeArquivo.equalsIgnoreCase("dados.txt"))   {
            throw new FileNotFoundException("Erro");
        }

        if (nomeArquivo.equalsIgnoreCase("banco.sql")){
            throw new SQLException("Erro");
        }
    }

}

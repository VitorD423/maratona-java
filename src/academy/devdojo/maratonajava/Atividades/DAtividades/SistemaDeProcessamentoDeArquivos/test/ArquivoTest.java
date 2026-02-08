package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeProcessamentoDeArquivos.test;

import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaDeProcessamentoDeArquivos.dominio.ArquivoService;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ArquivoTest {
    public static void main(String[] args) {

        try {
            ArquivoService.processarArquivo("",20);
        } catch (IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do IllegalArgumentException,ArithmeticException e FileNotFoundException");
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        } catch (SQLException e){
            System.out.println("Dentro do SQLException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        finally {
            System.out.println("Processamento finalizado");
        }
    }
}

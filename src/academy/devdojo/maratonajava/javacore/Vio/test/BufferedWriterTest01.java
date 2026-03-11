package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt"); //Criando o arquivo
        try (FileWriter fw = new FileWriter(file, true); // Writer responsavel pela escrita do arquivo
             BufferedWriter br = new BufferedWriter(fw)){
            br.write("O DevDojo é lindo, é o melhor curso do brasilllllllll\nContinuando a cantoria na próxima linha");
            br.newLine(); // Pular linha baseado no sistema operacional
            br.flush(); //Ele garante que os dados sejam salvos sem esperar o buffer encher ou o arquivo fechar
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

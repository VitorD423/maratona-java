package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir(); // vai criar um diretorio
        System.out.println("Pasta criada? "+isDiretorioCreated);
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");

        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado? "+isFileCreated);

        // Como renomear um arquivo:
        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado "+isRenamed);

        // Depois de ser renomeado o arquivo saiu da pasta
        // Pra manter o arquivo dentro do mesmo diretorio tem que passar o mesmo diretorio
        // (fileDiretorio,"arquivo_renomeado.txt")

        //Pra renomear um diretorio

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado "+isDiretorioRenomeado);

    }
}

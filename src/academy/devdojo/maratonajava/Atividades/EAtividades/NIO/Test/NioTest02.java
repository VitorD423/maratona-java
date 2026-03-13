package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioTest02 {
    public static void main(String[] args) throws IOException {
        Path pasta = Paths.get("estudos");
        if (Files.notExists(pasta)){
            Path diretorio = Files.createDirectory(pasta);
        }
        Path arquivo = Paths.get("java.txt");
        Path juncao = pasta.resolve(arquivo);
        System.out.println(juncao);
    }
}

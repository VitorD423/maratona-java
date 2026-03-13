package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NioTest01 {
    public static void main(String[] args) throws IOException {
        Path pasta = Paths.get("treino");
        if (Files.notExists(pasta)){
            Path diretorio = Files.createDirectory(pasta);
        }
        Path file = Paths.get(pasta.toString(),"anotacoes.txt");
        if (Files.notExists(file)){
            Path arquivoCriacao = Files.createFile(file);
        }

        Path source = file;
        Path target = Paths.get(file.getParent().toString(),"anotacoes_backup.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);

    }
}

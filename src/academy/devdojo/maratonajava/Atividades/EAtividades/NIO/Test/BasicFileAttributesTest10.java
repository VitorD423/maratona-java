package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesTest10 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2");
        ;
try(var arquivos = Files.list(path)) {
    arquivos.forEach(arquivo -> {
        try {
            System.out.println(arquivo.getFileName() + " - " + Files.size(arquivo));
        }catch (IOException e){
            e.printStackTrace();
        }
    });
}


    }
}

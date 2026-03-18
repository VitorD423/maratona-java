package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesTest11 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2");



        try (var arquivos = Files.list(path)){
            arquivos.forEach(arquivo ->{
                try {
                    BasicFileAttributes attr = Files.readAttributes(arquivo, BasicFileAttributes.class);

                    if (attr.isRegularFile() && attr.size() > 1024){
                        System.out.println("Nome: "+arquivo.getFileName() + " - " + " Tamanho " + attr.size() + " - " + " Data: " + attr.lastModifiedTime() );
                    }else {
                        System.out.println("Arquivo muito pequeno");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

    }
}

package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesTest09 {
    public static void main(String[] args) throws IOException {

        //SEM BasicFileAttributes
        Path path = Paths.get("pasta2/arquivo.txt");
//        boolean fileExist = Files.exists(path);
//        System.out.println(fileExist);
//        System.out.println(Files.size(path));
//        System.out.println("É um diretorio? "+ Files.isDirectory(path));
//        System.out.println("É um arquivo comun? "+ Files.isRegularFile(path));
//        System.out.println("Ultima modificação "+ Files.getLastModifiedTime(path));


        BasicFileAttributes attr = Files.readAttributes(path,BasicFileAttributes.class);

        System.out.println("Tamanho "+attr.size());
        System.out.println("É um diretorio? "+attr.isDirectory());
        System.out.println("É um arquivo comun "+attr.isRegularFile());
        System.out.println("Data da ultima modificação "+attr.lastModifiedTime());
    }
}

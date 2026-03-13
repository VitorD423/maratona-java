package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");// new File(pasta)
        if (Files.notExists(pastaPath)){
        Path pastaDorectory = Files.createDirectory(pastaPath);
        //Isso funciona quando tem 1 diretorio
        //Aqui não vai lançar a exeção
        }
        //Caso arquivo já exista ele lança uma exeção
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        //Ele vai criar as pastas pais caso elas não existam

        Path filePath = Paths.get(subPastaPath.toString(),"file.txt");

        if (Files.notExists(filePath)){
        Path filePathCreated = Files.createFile(filePath);
        }

        //Como copiar um arquivo renomeando ele

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}

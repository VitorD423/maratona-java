package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


public class UnzipTest01 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("pasta/arquivo.zip");
        Path destino = Paths.get("pasta/descompactado");

        unzip(zipFile, destino);
    }

    private static void unzip(Path zipFile, Path destino){
        try {
            Files.createDirectories(destino);

            try (ZipInputStream zis =
                     new ZipInputStream(Files.newInputStream(zipFile))){
                ZipEntry entry;

                while ((entry = zis.getNextEntry()) != null){
                //Enquanto existir arquivo dentro do zip
                    Path novoArquivo = destino.resolve(entry.getName());

                    if (entry.isDirectory()){
                        Files.createDirectories(novoArquivo);
                    } else {
                        Files.createDirectories(novoArquivo.getParent());

                        Files.copy(zis, novoArquivo, StandardCopyOption.REPLACE_EXISTING);
                    }

                    zis.closeEntry();
                }
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

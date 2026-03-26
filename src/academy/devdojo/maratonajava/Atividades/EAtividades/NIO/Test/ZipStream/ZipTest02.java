package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test.ZipStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTest02 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("Pagina1.txt");
        Path path2 = Paths.get("Pagina2.txt");
        Files.writeString(path1, "ESCRITA PAGINA 1");
        Files.writeString(path2, "ESCRITA PAGINA 2");
        Path zip = Paths.get("arquivo.zip");

        try (ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(zip))){

            ZipEntry zipEntry1 = new ZipEntry(path1.getFileName().toString());
            ZipEntry zipEntry2 = new ZipEntry(path2.getFileName().toString());
            zos.putNextEntry(zipEntry1);
            zos.putNextEntry(zipEntry2);


        }
    }
}

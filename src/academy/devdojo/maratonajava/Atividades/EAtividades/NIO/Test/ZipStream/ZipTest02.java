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

        try (ZipOutputStream zop = new ZipOutputStream(Files.newOutputStream(zip))){

            ZipEntry zipEntry = new ZipEntry(path1.getFileName().toString());
        }
    }
}

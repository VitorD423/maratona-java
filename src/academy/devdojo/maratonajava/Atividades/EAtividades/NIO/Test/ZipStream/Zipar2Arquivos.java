package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test.ZipStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zipar2Arquivos {
    public static void main(String[] args) throws IOException {
        // Colocar DOIS arquivos dentro de UM zip

        Path arquivo1 = Paths.get("arquivo1.txt");
        Path arquivo2 = Paths.get("arquivo2.txt");
        Path zip = Paths.get("meuarquivo.zip");
        Files.writeString(arquivo1,"Conteudo 1");
        Files.writeString(arquivo2,"Conteudo 2");
        System.out.println(Files.exists(arquivo1));
        System.out.println(Files.exists(arquivo2));

        try (ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(zip))){

            ZipEntry entry1 = new ZipEntry(arquivo1.getFileName().toString());
            zos.putNextEntry(entry1);
            Files.copy(arquivo1, zos);
            zos.closeEntry();

            ZipEntry entry2 = new ZipEntry(arquivo2.getFileName().toString());
            zos.putNextEntry(entry2);

            Files.copy(arquivo2, zos);

            zos.closeEntry();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

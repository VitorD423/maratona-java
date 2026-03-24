package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test.ZipStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class OutInTest01 {
    public static void main(String[] args) throws IOException {

        Path arquivo = Paths.get("arquivo.txt");
        Path zip = Paths.get("arquivo.zip");
        Path destino = Paths.get("arquivo_copia.txt");

        Files.writeString(arquivo, "Olá, isso é um teste!");

        //Para zipar o arquivo
        try (ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(zip))){
            ZipEntry entry = new ZipEntry(arquivo.getFileName().toString());
            zos.putNextEntry(entry);
            Files.copy(arquivo, zos);
            zos.closeEntry();
        } catch (IOException e){
            e.printStackTrace();
        }

        try (ZipInputStream zis = new ZipInputStream(Files.newInputStream(zip))){
            ZipEntry entry = zis.getNextEntry();

            Files.copy(zis,destino, StandardCopyOption.REPLACE_EXISTING);

            zis.closeEntry();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Processo finalizado!");
    }
}

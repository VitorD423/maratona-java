package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test.ZipStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipTest01 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("arquivo3.txt");
        Path path2 = Paths.get("arquivo4.txt");

        Files.writeString(path1,"TEXTO");
        Files.writeString(path2,"TEXTO");

        try (ZipOutputStream zip = new ZipOutputStream(Files.newOutputStream())){

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

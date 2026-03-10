package academy.devdojo.maratonajava.javacore.Vio.test;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            //boolean isDeleted = file.delete(); Vai deletar o arquivo
            boolean isCreated = file.createNewFile(); // Vai criar o arquivo
            System.out.println("Created "+isCreated);
            System.out.println("path "+file.getPath()); // Vai mostrar o caminho
            System.out.println("path absolute "+ file.getAbsolutePath());
            System.out.println("Is directory "+ file.isDirectory()); // É um diretorio
            System.out.println("Is file "+ file.isFile()); // É um arquivo
            System.out.println("Is hidden "+ file.isHidden()); // É oculto
            System.out.println("last modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())); // Quando foi modificado
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted "+file.delete());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

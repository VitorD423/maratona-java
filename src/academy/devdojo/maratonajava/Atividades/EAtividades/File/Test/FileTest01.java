package academy.devdojo.maratonajava.Atividades.EAtividades.File.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("nomes.txt");
        try {
            boolean isCreate = file.createNewFile();

            try (FileWriter fw = new FileWriter(file)){
                fw.write("Naruto Goku Luffy");
            }

            try (FileReader fr = new FileReader(file)){
                int i;
                while ((i = fr.read()) != -1){
                    System.out.print((char) i);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

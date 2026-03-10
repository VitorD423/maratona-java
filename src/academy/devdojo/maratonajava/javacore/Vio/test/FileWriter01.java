package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("O DevDojo é lindo, é o melhor curso do brasilllllllll\nContinuando a cantoria na próxima linha");

            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioTest03 {
    public static void main(String[] args) throws IOException {
        Path pastas = Paths.get("projeto/src");
        Files.createDirectories(pastas);
        Path file = pastas.resolve("Main.java");
        if (Files.notExists(file)){
            Files.createFile(file);
        }
    }
}

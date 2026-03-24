package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test.NioDesafio;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class MeuVisitor extends SimpleFileVisitor<Path>{


    int javaCount = 0;
    int txtCount = 0;
    int pngCount = 0;


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        String nome = file.getFileName().toString();

        if (file.getFileName().toString().endsWith(".java ")){
            javaCount++;
        } else if (file.getFileName().toString().endsWith(".txt ")) {
            txtCount++;
        } else if (file.getFileName().toString().endsWith(".png ")) {
            pngCount++;
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        MeuVisitor visitor = new MeuVisitor();
        Files.walkFileTree(path, visitor);

        System.out.println(".java: " + visitor.javaCount);
        System.out.println(".txt: " + visitor.txtCount);
        System.out.println(".png: " + visitor.pngCount);
    }
}

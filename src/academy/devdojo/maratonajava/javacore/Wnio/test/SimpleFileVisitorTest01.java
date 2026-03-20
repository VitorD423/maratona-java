package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
       //ESSE if VAI MOSTRAR APENAS OS .JAVA

        if (file.getFileName().toString().endsWith(".java")){
        System.out.println(file.getFileName());
       }
        return FileVisitResult.CONTINUE;

                //CONTINUE
                //TEMINATE
                //SKIP_SUBTREE
                //SKIP_SIBLINGS
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        //COMO FUNCIONA
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllFiles()); //O segundo parametro é um file visitor
    }
}

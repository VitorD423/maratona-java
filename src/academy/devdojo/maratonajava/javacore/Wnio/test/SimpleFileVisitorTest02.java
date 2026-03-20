package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre visit "+dir.getFileName());
        return FileVisitResult.CONTINUE;
        //QUANDO ENTRA NA PASTA
        //SE USAR O SKIP_SUBTREE NO LUGAR DO CONTINUE
        //ELE VAI PULAR TUDO QUE ESTA DENTRO DA PASTA "pasta"
        // O SKIP_SIBLINGS VAI IGNORAR TODOS OS "IRMÃOS"
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
        //QUANDO TENTAR LER O ARQUIVO E ELE NÃO TIVER PERMISSÃO DE LEITURA
        //QUALQUER TIPO DE PROBLEMA PARA PEGAR O ARQUIVO
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post visit "+dir.getFileName());
        return FileVisitResult.CONTINUE;
        //QUANDO ESTÁ SAINDO DA PASTA
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        //COMO FUNCIONA
        Path root = Paths.get("pasta");
        Files.walkFileTree(root, new ListAllFiles()); //O segundo parametro é um file visitor
    }
}

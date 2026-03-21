package academy.devdojo.maratonajava.javacore.Wnio.test;
//TODOS OS DIRETORIOS
//COM O NOME TEST
//QUE TEM A EXTENÇÃO OU .JAVA OU .CLASS
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class Lista extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}


public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get(".");
        Files.walkFileTree(path, new Lista());
    }

}

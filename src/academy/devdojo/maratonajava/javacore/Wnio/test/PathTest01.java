package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\vitordiego\\IdeaProjects\\maratona-java\\pasta2\\arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\vitordiego\\IdeaProjects\\maratona-java\\pasta2\\arquivo.txt");
        Path p3 = Paths.get("C:\\Users\\vitordiego\\IdeaProjects\\maratona-java\\pasta2\\arquivo.txt");
        Path p4 = Paths.get("C:\\Users\\vitordiego\\IdeaProjects\\maratona-java\\pasta2\\arquivo.txt");
        System.out.println(p1.getFileName());
    }
}

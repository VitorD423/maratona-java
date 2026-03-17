package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest05 {
    public static void main(String[] args) {
        Path path1 = Paths.get("/home/vitor");
        Path path2 = Paths.get("/home/vitor/projetos/java/Main.java");
        System.out.println(path1.relativize(path2));
    }
}

package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest04 {
    public static void main(String[] args) {
        Path path = Paths.get("home/vitor/dev/.././../arquivo.txt");
        System.out.println(path);
        System.out.println(path.normalize());
    }
}

package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DesafioTest08 {
    public static void main(String[] args) {
        Path base = Paths.get("/home/vitor/dev/./projetos/../java");
        Path arquivo = Paths.get("/home/vitor/dev/java/../../imagens/./foto.png");

        Path normalize1 = base.normalize();
        Path normalize2 = arquivo.normalize();

        System.out.println(normalize1);
        System.out.println(normalize2);
        System.out.println(normalize1.relativize(normalize2));
        System.out.println(normalize2.relativize(normalize1));

    }
}

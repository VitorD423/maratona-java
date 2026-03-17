package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest07 {
    public static void main(String[] args) {
        Path base = Paths.get("/home/vitor/dev");
        Path destino = Paths.get("/home/vitor/imagens/foto.png");

        System.out.println(base.relativize(destino));
        System.out.println(destino.relativize(base));
    }
}

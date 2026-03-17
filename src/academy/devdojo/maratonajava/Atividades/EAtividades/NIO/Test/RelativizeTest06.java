package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest06 {
    public static void main(String[] args) {
        Path absoluto = Paths.get("/home/vitor");
        Path relativo = Paths.get("temp/arquivo.txt");

        System.out.println(absoluto.relativize(relativo));
    }
}

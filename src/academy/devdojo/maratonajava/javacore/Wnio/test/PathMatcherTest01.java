package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matches(path1,"glob:*.bkp"); //GLOB É TIPO UM REGEX
        //AQUI, POR EXEMPLO, ESTA FALANDO QUERO UM QUE TERMINE COM .bkp
        matches(path1,"glob:**/*.bkp"); // AQUI VAI CONSIDERAR OS DIRETORIOS
        //E TAMBÉM VAI IGNORAR TUDO QUE TEM PARA ESQUERDA DO PONTO bkp
        matches(path1,"glob:**/*.{bkp,txt,java}");
        matches(path2,"glob:**/*.{bkp,txt,java}");
        matches(path3,"glob:**/*.{bkp,txt,java}");
        //VAI PROCURAR .bkp .txt. java
        matches(path1,"glob:**/*.???");
        matches(path2,"glob:**/*.???");
        matches(path3,"glob:**/*.???");
        //PROCURANDO ARQUIVO COM EXATAMENTE 3 LETRAS NA EXTENÇÃO
        matches(path3,"glob:**/file.???");
        //PROCURANDO POR NOME ESPECÍFICO
        



    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+matcher.matches(path));
    }
}

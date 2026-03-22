package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test.NioDesafio;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ListAllFiles extends SimpleFileVisitor<Path>{
    private List<String> relatorio;
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*.{java}");

    public ListAllFiles(List<String> relatorio){
        this.relatorio = relatorio;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        var creationTime = attrs.creationTime();
        var lastModifiedTime = attrs.lastModifiedTime();

        Date dateCriacao = new Date(creationTime.toMillis());
        Date dateModificacao = new Date(lastModifiedTime.toMillis());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String dataCriacaoFormatada = simpleDateFormat.format(dateCriacao);
        String dataModFormatada = simpleDateFormat.format(dateModificacao);


        if (matcher.matches(file) && attrs.size() > 1024) {

            String linha = file.getFileName() + " - " + attrs.size() + " bytes" + " - Criado: " + dataCriacaoFormatada + " - Modificado: " + dataModFormatada;

            relatorio.add(linha);
        }

        return FileVisitResult.CONTINUE;
    }
}


public class DesafioTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        List<String> relatorio = new ArrayList<>();
        Files.walkFileTree(path, new ListAllFiles(relatorio));
        Path output = Paths.get("relatorio.txt");
        Files.write(output,relatorio);
    }
}

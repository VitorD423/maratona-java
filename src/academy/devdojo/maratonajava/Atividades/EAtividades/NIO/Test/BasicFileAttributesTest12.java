package academy.devdojo.maratonajava.Atividades.EAtividades.NIO.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicFileAttributesTest12 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2");



        try (var arquivos = Files.list(path)){
            arquivos.forEach(arquivo ->{
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                try {
                    BasicFileAttributes attr = Files.readAttributes(arquivo, BasicFileAttributes.class);

                    Date date = new Date(attr.lastModifiedTime().toMillis());
                    String dataFormatada = formatador.format(date);

                    if (attr.isRegularFile()){
                        if (attr.size() < 1024){
                            System.out.println("Nome: "+arquivo.getFileName() + " - " + " Tamanho " + attr.size() + " - " + " PEQUENO " + " - " + "Data: " + dataFormatada);
                        }else if (attr.size() < 1024 * 1024){
                            System.out.println("Nome: "+arquivo.getFileName() + " - " + " Tamanho " + attr.size() + " - " + " MÉDIO " + " - " + "Data: " + dataFormatada );
                        } else {
                            System.out.println("Nome: "+arquivo.getFileName() + " - " + " Tamanho " + attr.size() + " - " + " GRANDE "  + " - " + "Data: " + dataFormatada);

                        }
                    }



                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }

    }
}

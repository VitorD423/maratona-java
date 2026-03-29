package academy.devdojo.maratonajava.Atividades.EAtividades.Serializacao.ATV2.test;

import academy.devdojo.maratonajava.Atividades.EAtividades.Serializacao.ATV2.dominio.Aluno;
import academy.devdojo.maratonajava.Atividades.EAtividades.Serializacao.ATV2.dominio.Materias;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SerializacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Vitor",1,"BOLO");
        aluno.setMaterias(List.of(new Materias("Portugues",2),
                new Materias("Matematica", 5)));
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/atv2.ser");
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){
            oss.writeObject(aluno);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private  static  void  deserializar(){
        Path path = Paths.get("pasta/atv2.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException |ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

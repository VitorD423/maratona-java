package academy.devdojo.maratonajava.Atividades.EAtividades.Serializacao.ATV1.test;

import academy.devdojo.maratonajava.Atividades.EAtividades.Serializacao.ATV1.dominio.Pedido;
import academy.devdojo.maratonajava.Atividades.EAtividades.Serializacao.ATV1.dominio.Produto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SerializacaoTest {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("123");
        pedido.setProdutos(List.of(new Produto("Notebook", 3000),
                new Produto("Mouse", 100)));

        serializar(pedido);
        deserializar();
    }

    private static void serializar(Pedido pedido){
        Path path = Paths.get("pasta/Pedido.ser");
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))){
            oss.writeObject(pedido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void  deserializar(){
        Path path = Paths.get("pasta/Pedido.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Pedido pedido = (Pedido) ois.readObject();
            System.out.println(pedido);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

package academy.devdojo.maratonajava.Atividades.EAtividades.Serializacao.ATV1.dominio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Serializable {
    @Serial
    private static final long serialVersionUID = 9027369583793931353L;
    private String id;
    private transient List<Produto> produtos;

    public Pedido(String id) {
        this.id = id;
    }

    @Serial
    private void writeObject(ObjectOutputStream oss){
        int size = (produtos == null) ? 0 : produtos.size();
        try {
            oss.defaultWriteObject();
            oss.writeInt(size);

            if (produtos != null){
                for (Produto produto : produtos){
                    oss.writeUTF(produto.getNome());
                    oss.writeDouble(produto.getPreco());
                }
            }

        }catch (IOException e){
            e.printStackTrace();

        }
    }

    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            int tamanho = ois.readInt();
            produtos = new ArrayList<>();
            for (int i = 0; i < tamanho; i ++){
                String nome = ois.readUTF();
                double preco = ois.readDouble();
                Produto produto = new Produto(nome,preco);
                produtos.add(produto);
            }

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", produtos=" + produtos +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}

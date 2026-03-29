package academy.devdojo.maratonajava.Atividades.EAtividades.Serializacao.ATV2.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -572016195870678424L;
    private String nome;
    private  int id;
    private transient String senha;


    public Aluno(String nome, int id, String senha) {
        this.nome = nome;
        this.id = id;
        this.senha = senha;
    }

    @Serial
private void writeObject(ObjectOutputStream oos){
    try {
            oos.defaultWriteObject();
            oos.writeUTF(senha);
        }catch (IOException e){
        e.printStackTrace();
    }
}

private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            senha = ois.readUTF();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
}

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", senha='***" + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

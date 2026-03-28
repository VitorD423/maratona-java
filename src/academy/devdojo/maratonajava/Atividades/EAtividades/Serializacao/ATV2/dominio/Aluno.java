package academy.devdojo.maratonajava.Atividades.EAtividades.Serializacao.ATV2.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -572016195870678424L;
    private String nome;
    private  int id;
    transient String senha;


    public Aluno(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

@Serial
private void writeObject(ObjectOutputStream oos){
    try {
            oos.defaultWriteObject();
        }catch (IOException e){
        e.printStackTrace();
    }
}
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}

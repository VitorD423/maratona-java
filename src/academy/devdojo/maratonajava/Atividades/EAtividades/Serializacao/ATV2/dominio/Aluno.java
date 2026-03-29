package academy.devdojo.maratonajava.Atividades.EAtividades.Serializacao.ATV2.dominio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -572016195870678424L;
    private String nome;
    private  int id;
    private transient String senha;
    private transient List<Materias> materias;


    public Aluno(String nome, int id, String senha) {
        this.nome = nome;
        this.id = id;
        this.senha = senha;
    }

    @Serial
private void writeObject(ObjectOutputStream oos){
        int size = (materias == null) ? 0 : materias.size();
        try {
            oos.defaultWriteObject();
            oos.writeInt(size);
            oos.writeUTF(senha);
            if (materias != null ){
                for (Materias materia : materias){
                    oos.writeUTF(materia.getNome());
                    oos.writeDouble(materia.getValor());
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
            senha = ois.readUTF();
            materias = new ArrayList<>();
            for (int i = 0 ; i < tamanho; i ++){
                String nome = ois.readUTF();
                double preco = ois.readDouble();
                Materias materias1 = new Materias(nome,preco);
                materias.add(materias1);
            }
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
                ", Matérias =" + materias +
                '}';
    }

    public List<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materias> materias) {
        this.materias = materias;
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

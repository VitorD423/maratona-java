package academy.devdojo.maratonajava.Atividades.EAtividades.Colecoes.SortingList.dominio;

import java.util.Comparator;
import java.util.Objects;

public class Celular implements Comparable<Celular> {
    private Long id;
    private String modelo;
    private double preco;

    public Celular(Long id, String modelo, double preco) {
        Objects.requireNonNull(id,"Id não pode ser null");
        Objects.requireNonNull(modelo,"Modelo não pode ser null");
        this.id = id;
        this.modelo = modelo;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Celular celular = (Celular) o;
        return Double.compare(preco, celular.preco) == 0 && Objects.equals(id, celular.id) && Objects.equals(modelo, celular.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelo, preco);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Celular celular) {
        return this.id.compareTo(celular.getId());
    }
}

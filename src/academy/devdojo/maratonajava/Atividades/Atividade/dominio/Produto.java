package academy.devdojo.maratonajava.Atividades.Atividade.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto (String nome, double preco, int quantidade){
        this.nome = nome;
       setPreco(preco);
       setQuantidade(quantidade);
    }

    public Produto (String nome, double preco){
    this.nome = nome;
    setPreco(preco);
    this.quantidade = 0;
    }



    public void imprimirProduto(){
        System.out.print("Nome do produto: "+ this.nome + " | ");
        System.out.print("Preço do produto: "+this.preco + " | ");
        System.out.print("Produto em estoque: "+this.quantidade);
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {


        return preco;
    }

    public void setPreco(double preco) {

        if (preco <= 0){
            System.out.println("Preço invalido");
            return;
        }
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0){
            System.out.println("Quantidade invalida");
            return;
        }

        this.quantidade = quantidade;
    }
}

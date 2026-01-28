package academy.devdojo.maratonajava.Atividades.Atividade.dominio;

public class Loja {
    private String nome;
    private double preco;
    private static int totalProdutos = 0;
    private static double imposto = 0.10;

    public Loja(String nome, double preco){
        if (nome == null || nome.isBlank()){
            System.out.println("Nome inválido");
            return;
        }
        if (preco <= 0){
            System.out.println("Preço inválido");
            return;
        }


        this.nome = nome;
        this.preco = preco;
        Loja.totalProdutos ++;
    }


    public void imprimirProduto(){
        System.out.print("Nome: "+ this.nome + " | ");
        System.out.print("Preço: "+ this.preco + " | ");
        System.out.print("Total de produtos: "+ Loja.totalProdutos + " | ");
        System.out.println("Imposto: "+ Loja.imposto);
    }












    public String getNome() {
        return nome;
    }

    public static int getTotalProdutos() {
        return totalProdutos;
    }

   public static void setTotalProdutos(int totalProdutos) {
        Loja.totalProdutos = totalProdutos;
    }

    public static double getImposto() {
        return imposto;
    }

    public static void setImposto(double imposto) {
        if (imposto < 0){
            System.out.println("Imposto inválido");
            return;
        }

        Loja.imposto = imposto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

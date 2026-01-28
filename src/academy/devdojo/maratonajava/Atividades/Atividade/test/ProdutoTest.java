package academy.devdojo.maratonajava.Atividades.Atividade.test;

import academy.devdojo.maratonajava.Atividades.Atividade.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("RTX 3080",35.000,20);
        Produto produto2 = new Produto("Ryzen 5 3600",12.000,10);

        produto1.imprimirProduto();
        System.out.println();
        produto2.imprimirProduto();
    }

}

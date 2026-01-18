package academy.devdojo.maratonajava.javacore.Atividade.test;

import academy.devdojo.maratonajava.javacore.Atividade.dominio.Loja;

public class LojaTest {
    public static void main(String[] args) {
        Loja produto1 = new Loja("Ventilador",200);
        Loja produto2 = new Loja("Mouse",250);
        Loja produto3 = new Loja("Cadeira",100);


        produto1.imprimirProduto();
        produto2.imprimirProduto();
        produto3.imprimirProduto();
    }
}

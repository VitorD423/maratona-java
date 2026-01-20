package academy.devdojo.maratonajava.javacore.BAtividade.test;

import academy.devdojo.maratonajava.javacore.BAtividade.dominio.Biblioteca;
import academy.devdojo.maratonajava.javacore.BAtividade.dominio.Livro;

public class BibliotecaTest {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Livro livro1 = new Livro("Gigabyte","RTX");
        Livro livro2 =  new Livro("One piece", "Oda");
        Livro livro3 =  new Livro("Naruto", "Kishimoto");
        Livro livro4 =  new Livro("Dragon Ball ", "Akira");

        biblioteca.emprestarLivro(livro1);
        biblioteca.emprestarLivro(livro2);
        biblioteca.emprestarLivro(livro3);
        biblioteca.emprestarLivro(livro4);

        biblioteca.imprimirStatus();
    }
}

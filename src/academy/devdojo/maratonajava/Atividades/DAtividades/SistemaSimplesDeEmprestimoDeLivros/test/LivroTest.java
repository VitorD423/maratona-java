package academy.devdojo.maratonajava.Atividades.DAtividades.SistemaSimplesDeEmprestimoDeLivros.test;

import academy.devdojo.maratonajava.Atividades.DAtividades.SistemaSimplesDeEmprestimoDeLivros.dominio.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O pequeno dalite",false);

        System.out.println(livro1.isEmprestado());

        try {
            livro1.emprestar();
            System.out.println("Livro emprestado com sucesso");
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Processo de empréstimo finalizado");
        }

        System.out.println("----------------------------");

        System.out.println(livro1.isEmprestado());

        try {
            livro1.emprestar();
            System.out.println("Livro emprestado com sucesso");
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Processo de empréstimo finalizado");
        }
    }
}

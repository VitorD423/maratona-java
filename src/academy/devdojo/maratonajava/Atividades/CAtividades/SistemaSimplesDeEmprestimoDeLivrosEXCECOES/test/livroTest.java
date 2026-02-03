package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaSimplesDeEmprestimoDeLivrosEXCECOES.test;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaSimplesDeEmprestimoDeLivrosEXCECOES.dominio.Livro;

public class livroTest {
    public static void main(String[] args) {
        Livro livro = new Livro("Pequeno dalite",1);

        System.out.println("Disponível: " + livro.getQuantidadeDisponivel());

        try {
            livro.emprestar();
            System.out.println("Emprestado");
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }


        System.out.println("-------------------------");
        try {
            livro.emprestar();
            System.out.println("Emprestado 2");
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Disponível: " + livro.getQuantidadeDisponivel());
    }
}

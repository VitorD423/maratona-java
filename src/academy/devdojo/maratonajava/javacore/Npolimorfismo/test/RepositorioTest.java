package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        RepositorioBancoDeDados repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}

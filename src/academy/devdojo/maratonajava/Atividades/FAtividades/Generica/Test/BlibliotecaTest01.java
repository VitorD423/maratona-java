package academy.devdojo.maratonajava.Atividades.FAtividades.Generica.Test;

import academy.devdojo.maratonajava.Atividades.FAtividades.Generica.dominio.Livro;
import academy.devdojo.maratonajava.Atividades.FAtividades.Generica.dominio.Revista;
import academy.devdojo.maratonajava.Atividades.FAtividades.Generica.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class BlibliotecaTest01 {
    public static void main(String[] args) {
        List<Livro> livrosDisponiveis = new ArrayList<>(List.of(new Livro("Pequeno dalite"), new Livro("A arte da guerra")));
        List<Revista> revitasDisponiveis = new ArrayList<>(List.of(new Revista("Avon 2012"), new Revista("Delux 2025")));

        RentalService<Livro> rentalServiceLivro = new RentalService<>(livrosDisponiveis);
        Livro livro = rentalServiceLivro.buscarObjetoDisponivel();
        System.out.println("Usando o livro por 2 semanas");
        rentalServiceLivro.retornarObjetoAlugado(livro);

        System.out.println("-------------------");

        RentalService<Revista> rentalServiceRevista = new RentalService<>(revitasDisponiveis);
        Revista revista = rentalServiceRevista.buscarObjetoDisponivel();
        System.out.println("Usando a revista por 5 minutos");
        rentalServiceRevista.retornarObjetoAlugado(revista);
    }
}

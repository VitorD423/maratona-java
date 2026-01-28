package academy.devdojo.maratonajava.Atividades.Atividade.test;

import academy.devdojo.maratonajava.Atividades.Atividade.dominio.ContaCorrente;
import academy.devdojo.maratonajava.Atividades.Atividade.service.CorrenteService;

public class CorrenteTest {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente();
        CorrenteService correnteService = new CorrenteService();

        corrente.init("Vitor",1000);
        corrente.imprimirConta();
        System.out.println("\n");

        correnteService.depositar(corrente,500);
        corrente.imprimirConta();
        System.out.println("\n");

        correnteService.sacar(corrente,2000);
        corrente.imprimirConta();
        System.out.println("\n");

        corrente.aplicarRendimento(3);
        corrente.imprimirConta();
        System.out.println("\n");
    }
}

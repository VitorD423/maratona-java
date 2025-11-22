package academy.devdojo.maratonajava.javacore.Atividade.test;

import academy.devdojo.maratonajava.javacore.Atividade.dominio.ContaBancaria;
import academy.devdojo.maratonajava.javacore.Atividade.service.ContaService;

public class ContaTest {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        ContaService service = new ContaService();

        conta.init("Vitor", 2500, 25503344);
        conta.imprimirConta();
        System.out.println("\n");

        service.depositar(conta, 1500);
        conta.imprimirConta();
        System.out.println("\n");

        service.sacar(conta, 6000);
        conta.imprimirConta();
        System.out.println("\n");

        ContaBancaria copia = service.criarcopia(conta);
        copia.imprimirConta();



    }
}

package academy.devdojo.maratonajava.javacore.Atividade.service;

import academy.devdojo.maratonajava.javacore.Atividade.dominio.ContaBancaria;

public class ContaService {
   public void depositar(ContaBancaria conta, double valor){
        double valorAtual = conta.getSaldo();
        double valorNovo = valorAtual + valor;
        conta.setSaldo(valorNovo);
    }

   public void sacar(ContaBancaria conta, double valor){
        double valorAtual = conta.getSaldo();
        if (valor > valorAtual){
            System.out.println("Valor insuficiente");
            return;
        }
            double valorNovo = valorAtual - valor;
            conta.setSaldo(valorNovo);


    }

    public ContaBancaria criarcopia(ContaBancaria original){
        ContaBancaria copia = new ContaBancaria();
        String titular = original.getTitular();
        double saldo = original.getSaldo();
        int numeroDaConta = original.getNumeroDaConta();

        copia.init(titular, saldo, numeroDaConta );
        return copia;
    }
}

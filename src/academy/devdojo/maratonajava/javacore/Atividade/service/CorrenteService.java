package academy.devdojo.maratonajava.javacore.Atividade.service;

import academy.devdojo.maratonajava.javacore.Atividade.dominio.ContaCorrente;

public class CorrenteService {
    public void depositar(ContaCorrente conta, double valor){
        double valorAtual = conta.getSaldo();
        double valorNovo = valorAtual + valor;
        conta.setSaldo(valorNovo);
    }

    public void sacar(ContaCorrente conta, double valor){
        double valorAtual = conta.getSaldo();
        if (valor > valorAtual){
            System.out.println("Valor insuficiente");
            return;
        }
        double valorNovo = valorAtual - valor;
        conta.setSaldo(valorNovo);
    }




}

// terminar depois
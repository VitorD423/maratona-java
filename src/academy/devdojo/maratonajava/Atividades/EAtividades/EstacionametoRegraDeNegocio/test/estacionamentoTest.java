package academy.devdojo.maratonajava.Atividades.EAtividades.EstacionametoRegraDeNegocio.test;

import academy.devdojo.maratonajava.Atividades.EAtividades.EstacionametoRegraDeNegocio.servico.Estacionamento;

public class estacionamentoTest {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        double valorFinal = estacionamento.calcularValor(9);
        System.out.println("Valor final" + valorFinal);
    }
}

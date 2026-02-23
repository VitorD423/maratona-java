package academy.devdojo.maratonajava.Atividades.EAtividades.EstacionametoRegraDeNegocio.test;

import academy.devdojo.maratonajava.Atividades.EAtividades.EstacionametoRegraDeNegocio.dominio.Cliente;
import academy.devdojo.maratonajava.Atividades.EAtividades.EstacionametoRegraDeNegocio.dominio.ClienteVip;
import academy.devdojo.maratonajava.Atividades.EAtividades.EstacionametoRegraDeNegocio.servico.Estacionamento;

public class estacionamentoTest {
    public static void main(String[] args) {
        Cliente clienteVip = new ClienteVip("Vitor");
        long horas = 9;

        Estacionamento estacionamento = new Estacionamento();

        double valorPlano = estacionamento.calcularValor(horas);
        double valorFinal = clienteVip.aplicarBeneficio(valorPlano,horas);

        System.out.println("Valor do plano: " + valorPlano);
        System.out.println("Valor final: " + valorFinal);
    }
}

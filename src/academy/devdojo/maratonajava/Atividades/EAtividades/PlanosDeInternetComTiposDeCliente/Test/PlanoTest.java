package academy.devdojo.maratonajava.Atividades.EAtividades.PlanosDeInternetComTiposDeCliente.Test;

import academy.devdojo.maratonajava.Atividades.EAtividades.PlanosDeInternetComTiposDeCliente.dominio.Cliente;
import academy.devdojo.maratonajava.Atividades.EAtividades.PlanosDeInternetComTiposDeCliente.dominio.ClienteComum;
import academy.devdojo.maratonajava.Atividades.EAtividades.PlanosDeInternetComTiposDeCliente.servico.CalculadoraPlano;

public class PlanoTest {
    public static void main(String[] args) {
        Cliente clienteComum = new ClienteComum("Vitor");
        long gigabytes = 25;

        CalculadoraPlano calculadora = new CalculadoraPlano();
        double valorPlano = calculadora.calcularValorPlano(gigabytes);

        double valorFinal = clienteComum.aplicarBeneficio(valorPlano);

        System.out.println("Cliente: " + clienteComum.getNome());
        System.out.println("Plano: " + gigabytes + "GB");
        System.out.println("Valor final: R$ " + valorFinal);
    }
}

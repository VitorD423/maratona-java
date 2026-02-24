package academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreming.service;

import academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreming.dominio.Cliente;
import academy.devdojo.maratonajava.Atividades.EAtividades.AssinaturaDeStreming.dominio.Plano;

public class StreamingService {

    public double calcularPlano(Cliente cliente, Plano plano, long gigabytesConsumidos) {

        double valorBase = plano.calcularValor(gigabytesConsumidos);

        return cliente.aplicarBeneficio(valorBase);

    }
}
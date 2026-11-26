package academy.devdojo.maratonajava.Atividades.EAtividades.Estacionamento.service;

import academy.devdojo.maratonajava.Atividades.EAtividades.Estacionamento.dominio.Cliente;
import academy.devdojo.maratonajava.Atividades.EAtividades.Estacionamento.dominio.Vaga;

public class EstacionamentoService {

    public double calcularPlano (Cliente cliente, Vaga vaga, long horasPassadas){
        double valorBase = vaga.calcularValor(horasPassadas);

        return cliente.aplicarBeneficio(valorBase);
    }
}

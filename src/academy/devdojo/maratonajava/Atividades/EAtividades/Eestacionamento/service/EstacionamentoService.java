package academy.devdojo.maratonajava.Atividades.EAtividades.Eestacionamento.service;

import academy.devdojo.maratonajava.Atividades.EAtividades.Eestacionamento.dominio.Cliente;
import academy.devdojo.maratonajava.Atividades.EAtividades.Eestacionamento.dominio.Vaga;

public class EstacionamentoService {

    public double calcularPlano (Cliente cliente, Vaga vaga, long horasPassadas){
        double valorBase = vaga.calcularValor(horasPassadas);

        return cliente.aplicarBeneficio(valorBase);
    }
}

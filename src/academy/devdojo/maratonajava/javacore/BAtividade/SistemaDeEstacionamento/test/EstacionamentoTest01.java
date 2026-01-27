package academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeEstacionamento.test;

import academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeEstacionamento.dominio.Estacionamento;
import academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeEstacionamento.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.BAtividade.SistemaDeEstacionamento.dominio.TipoVeiculo;

public class EstacionamentoTest01 {
    public static void main(String[] args) {
        Estacionamento veiculo1 = new Estacionamento(212121,3,TipoVeiculo.CARRO, TipoCliente.COMUM);
        Estacionamento veiculo2 = new Estacionamento(321456,7,TipoVeiculo.CAMINHAO, TipoCliente.MENSALISTA);

        veiculo1.imprimi();
        System.out.println("--------------------");
        veiculo2.imprimi();

    }
}

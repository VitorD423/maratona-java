package academy.devdojo.maratonajava.Atividades.EAtividades.Estacionamento.test;

import academy.devdojo.maratonajava.Atividades.EAtividades.Estacionamento.dominio.*;
import academy.devdojo.maratonajava.Atividades.EAtividades.Estacionamento.service.EstacionamentoService;

public class EstacionamentoTest {
    public static void main(String[] args) {
        EstacionamentoService service = new EstacionamentoService();

        Cliente clienteNormal = new ClienteNormal();
        Cliente clienteIdoso = new ClienteIdoso();
        Cliente clienteMensalista = new ClienteMensalista();

        Vaga vagaCoberta = new VagaCoberta();
        Vaga vagaComun = new VagaComum();
        Vaga vagaVIP = new VagaVIP();

        System.out.println("Test");

        System.out.println(service.calcularPlano(clienteMensalista,vagaCoberta,32));

    }
}

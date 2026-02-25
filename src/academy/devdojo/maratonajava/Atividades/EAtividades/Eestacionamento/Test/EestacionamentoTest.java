package academy.devdojo.maratonajava.Atividades.EAtividades.Eestacionamento.Test;

import academy.devdojo.maratonajava.Atividades.EAtividades.Eestacionamento.dominio.*;
import academy.devdojo.maratonajava.Atividades.EAtividades.Eestacionamento.service.EstacionamentoService;

public class EestacionamentoTest {
    public static void main(String[] args) {
        EstacionamentoService service = new EstacionamentoService();

        Cliente clienteNormal = new ClienteNormal();
        Cliente clienteIdoso = new ClienteIdoso();
        Cliente clienteMensalista = new ClienteMensalista();

        Vaga vagaCoberta = new VagaCoberta();

    }
}

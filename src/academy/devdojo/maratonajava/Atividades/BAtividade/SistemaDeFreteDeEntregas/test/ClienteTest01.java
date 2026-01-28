package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeFreteDeEntregas.test;

import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeFreteDeEntregas.dominio.ClienteComum;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeFreteDeEntregas.dominio.ClientePremium;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeFreteDeEntregas.dominio.TipoDeCliente;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeFreteDeEntregas.dominio.TipoEntrega;

public class ClienteTest01 {
    public static void main(String[] args) {
        TipoDeCliente cliente1 = new ClienteComum("Vitor",500, TipoEntrega.NORMAL);
        TipoDeCliente cliente2 = new ClientePremium("Diego",700,TipoEntrega.EXPRESSA);

        cliente1.imprimirResumo();
        System.out.println("---------------------");
        cliente2.imprimirResumo();
    }
}

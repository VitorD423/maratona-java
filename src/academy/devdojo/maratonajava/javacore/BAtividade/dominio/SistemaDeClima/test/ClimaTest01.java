package academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDeClima.test;

import academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDeClima.dominio.Cidade;
import academy.devdojo.maratonajava.javacore.BAtividade.dominio.SistemaDeClima.dominio.Clima;

public class ClimaTest01 {
    public static void main(String[] args) {
        Cidade cidade1 = new Cidade("Recife", Clima.CHUVOSO,140);
        Cidade cidade2 = new Cidade("Palmares", Clima.ENSOLARADO,10);

        cidade1.imprimir();
        cidade2.imprimir();
        cidade1.alterarClima(Clima.TEMPESTADE);
        cidade1.imprimir();
        cidade2.imprimir();



    }
}

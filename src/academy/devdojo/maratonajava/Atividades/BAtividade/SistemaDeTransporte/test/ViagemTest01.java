package academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeTransporte.test;

import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeTransporte.dominio.MeioTransporte;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeTransporte.dominio.TipoPassageiro;
import academy.devdojo.maratonajava.Atividades.BAtividade.SistemaDeTransporte.dominio.Viagem;

public class ViagemTest01 {
    public static void main(String[] args) {
        Viagem viagem1 = new Viagem("Porto de galinhas",2100, MeioTransporte.CARRO, TipoPassageiro.tipoPassageiroPorDescricao("Estudante paga meia"));
        Viagem viagem2 = new Viagem("Palmares",100, MeioTransporte.ONIBUS, TipoPassageiro.tipoPassageiroPorDescricao("Idoso não paga"));

        viagem1.imprimir();
        System.out.println("//////////////////");
        viagem2.imprimir();

    }

}

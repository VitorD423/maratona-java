package academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.Test;

import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.dominio.Entrega;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.dominio.EntregaInternacional;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.dominio.EntregaPAC;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.dominio.EntregaSedex;
import academy.devdojo.maratonajava.Atividades.CAtividades.SistemaDeFrete.servico.CalculadoraFrete;


public class EntregaTest01 {
    public static void main(String[] args) {
        Entrega entrega1 = new EntregaSedex("Camera filmadora",1.05);
        Entrega entrega2 = new EntregaPAC("Ventilador de chão",1.6);
        Entrega entrega3 = new EntregaInternacional("Computador Ryzen",1.5,"França");

        CalculadoraFrete.calcularFrete(entrega1);
        System.out.println("------------------------");
        CalculadoraFrete.calcularFrete(entrega2);
        System.out.println("------------------------");
        CalculadoraFrete.calcularFrete(entrega3);
    }
}

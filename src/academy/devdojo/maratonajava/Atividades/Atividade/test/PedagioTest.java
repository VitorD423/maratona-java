package academy.devdojo.maratonajava.Atividades.Atividade.test;

import academy.devdojo.maratonajava.Atividades.Atividade.dominio.Pedagio;

public class PedagioTest {
    public static void main(String[] args) {
        double valor1 = Pedagio.calcularValorPedagio("Carro");
        System.out.println("Valor Carro: " + valor1);

        double valor2 = Pedagio.calcularValorPedagio("MOTO");
        System.out.println("Valor Moto: " + valor2);


        double valor3 = Pedagio.calcularValorPedagio("CAMINHAO");
        System.out.println("Valor Caminhao: " + valor3);

        System.out.println("Total de veículos: " + Pedagio.getTotalVeiculos());
    }
}
